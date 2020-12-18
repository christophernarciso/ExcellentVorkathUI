
import components.*;
import util.VorkathToolTip;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ScriptFrame extends DreamFrame {

    private DreamPanel consumeConfigBody, combatConfigBody, travelConfigBody, content, combatContent;
    private DreamLabel consumeSettingLabel;
    private DreamLabel potionRangedLabel;
    private DreamTextField rangePotionTextField;
    private DreamLabel antifirePotionLabel;
    private DreamTextField antifirePotionTextField;
    private DreamLabel prayerPotionLabel;
    private DreamTextField prayerPotionTextField;
    private DreamLabel prayerPotionAmountLabel;
    private DreamTextField prayerPotionAmountTextField;
    private DreamLabel venomPotionLabel;
    private DreamTextField venomPotionTextField;
    private DreamLabel foodNameLabel;
    private DreamTextField foodNameTextField;
    private DreamLabel secondaryFoodNameLabel;
    private DreamTextField secondaryFoodNameTextField;
    private DreamLabel combatSettingsLabel;
    private DreamLabel primaryBoltNameLabel;
    private DreamTextField primaryBoltNameTextField;
    private DreamLabel secondaryBoltNameLabel;
    private DreamTextField secondaryBoltNameTextField;
    private DreamLabel allowSecondaryLabel;
    private DreamCheckBox allowSecondaryCheckbox;
    private DreamLabel travelSettingsLabel;
    private DreamLabel travelSettingHouseNexusLabel;
    private DreamCheckBox travelSettingUseNexusCheckbox;
    private DreamComboBox<NexusTeleport> nexusTeleportsCombobox;
    private DreamLabel travelSettingUseLunarPortalLabel;
    private DreamCheckBox travelSettingUseLunarPortalCheckbox;
    private DreamLabel travelSettingUseRejuvPoolLabel;
    private DreamCheckBox travelSettingUseRejuvPoolCheckbox;
    private DreamLabel travelSettingUseAltarLabel;
    private DreamCheckBox travelSettingUseAltarCheckbox;
    private DreamLabel scriptConditionsLabel;
    private DreamLabel scriptConditionsPetLabel;
    private DreamCheckBox scriptConditionsPetCheckbox;
    private DreamLabel scriptConditionsKillLabel;
    private DreamCheckBox scriptConditionsKillCheckbox;
    private DreamLabel killAmountLabel;
    private DreamTextField killAmountTextField;
    private DreamLabel scriptConditionsProfitLabel;
    private DreamCheckBox scriptConditionsProfitCheckbox;
    private DreamLabel profitAmountLabel;
    private DreamTextField profitAmountTextField;
    private DreamLabel allowCrossbowLabel;
    private DreamCheckBox allowCrossbowCheckbox;
    private DreamLabel instanceConditionLabel;
    private DreamLabel scriptConditionsKillsPerInstanceLabel;
    private DreamTextField killPerInstanceAmountTextField;
    private DreamCheckBox instanceConditionsKillsPerInstanceCheckbox;
    private DreamLabel travelSettingUseClanwarsLabel;
    private DreamCheckBox travelSettingUseClanwarsCheckbox;
    private DreamButton startButton;
    private DreamButton saveButton;
    private DreamButton loadButton;
    private DreamLabel allowBlowpipeLabel;
    private DreamCheckBox allowBlowpipeCheckbox;
    private DreamLabel dartNameLabel;
    private DreamTextField dartNameTextField;
    private DreamLabel allowSpecialLabel;
    private DreamComboBox<String> specialAttackType;

    public ScriptFrame() throws IOException {
        super("Excellent Vorkath 25.0", ImageIO.read(new URL("https://i.imgur.com/OkIRSl4.png")));
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - chris n
        consumeSettingLabel = new DreamLabel();
        potionRangedLabel = new DreamLabel();
        rangePotionTextField = new DreamTextField();
        antifirePotionLabel = new DreamLabel();
        antifirePotionTextField = new DreamTextField();
        prayerPotionLabel = new DreamLabel();
        prayerPotionTextField = new DreamTextField();
        prayerPotionAmountLabel = new DreamLabel();
        prayerPotionAmountTextField = new DreamTextField();
        venomPotionLabel = new DreamLabel();
        venomPotionTextField = new DreamTextField();
        foodNameLabel = new DreamLabel();
        foodNameTextField = new DreamTextField();
        secondaryFoodNameLabel = new DreamLabel();
        secondaryFoodNameTextField = new DreamTextField();
        combatSettingsLabel = new DreamLabel();
        primaryBoltNameLabel = new DreamLabel();
        primaryBoltNameTextField = new DreamTextField();
        secondaryBoltNameLabel = new DreamLabel();
        secondaryBoltNameTextField = new DreamTextField();
        allowSecondaryLabel = new DreamLabel();
        allowSecondaryCheckbox = new DreamCheckBox();
        travelSettingsLabel = new DreamLabel();
        travelSettingHouseNexusLabel = new DreamLabel();
        travelSettingUseNexusCheckbox = new DreamCheckBox();
        nexusTeleportsCombobox = new DreamComboBox<>();
        travelSettingUseLunarPortalLabel = new DreamLabel();
        travelSettingUseLunarPortalCheckbox = new DreamCheckBox();
        travelSettingUseRejuvPoolLabel = new DreamLabel();
        travelSettingUseRejuvPoolCheckbox = new DreamCheckBox();
        travelSettingUseAltarLabel = new DreamLabel();
        travelSettingUseAltarCheckbox = new DreamCheckBox();
        scriptConditionsLabel = new DreamLabel();
        scriptConditionsPetLabel = new DreamLabel();
        scriptConditionsPetCheckbox = new DreamCheckBox();
        scriptConditionsKillLabel = new DreamLabel();
        scriptConditionsKillCheckbox = new DreamCheckBox();
        killAmountLabel = new DreamLabel();
        killAmountTextField = new DreamTextField();
        scriptConditionsProfitLabel = new DreamLabel();
        scriptConditionsProfitCheckbox = new DreamCheckBox();
        profitAmountLabel = new DreamLabel();
        profitAmountTextField = new DreamTextField();
        allowCrossbowLabel = new DreamLabel();
        allowCrossbowCheckbox = new DreamCheckBox();
        instanceConditionLabel = new DreamLabel();
        scriptConditionsKillsPerInstanceLabel = new DreamLabel();
        killPerInstanceAmountTextField = new DreamTextField();
        instanceConditionsKillsPerInstanceCheckbox = new DreamCheckBox();
        travelSettingUseClanwarsLabel = new DreamLabel();
        travelSettingUseClanwarsCheckbox = new DreamCheckBox();
        startButton = new DreamButton("Start");
        saveButton = new DreamButton("Save");
        loadButton = new DreamButton("Load");
        allowBlowpipeLabel = new DreamLabel();
        allowBlowpipeCheckbox = new DreamCheckBox();
        dartNameLabel = new DreamLabel();
        dartNameTextField = new DreamTextField();
        allowSpecialLabel = new DreamLabel();
        specialAttackType = new DreamComboBox<>("BGS", "DWH");
        Font customFont = new Font("Arial", Font.BOLD, 15);;

        DreamTabbedPane tPane = new DreamTabbedPane();
        tPane.addTab("Consume Config", consumeConfigBody = new DreamPanel());
        tPane.addTab("Combat Config", combatConfigBody = new DreamPanel());
        tPane.addTab("Travel Config", travelConfigBody = new DreamPanel());
        setSize(500,400);
        setLocationRelativeTo(null);
        add(tPane, BorderLayout.CENTER);

        // CONSUME CONFIG BODY
        consumeConfigBody.setBorder(new EmptyBorder(7,8,7,8));
        consumeConfigBody.add(content = new DreamPanel(), BorderLayout.NORTH);
        GridLayout tabGrid = new GridLayout(0,2);
        GridLayout mainGrid = new GridLayout(0,1);
        tabGrid.setVgap(5);
        mainGrid.setVgap(5);
        content.setLayout(mainGrid);

        /*
            Potion Setting Config Start
         */
        DreamPanel potionSetting = new DreamPanel(new GridLayout(0, 2));
        Border configBorder = BorderFactory.createLineBorder(Color.ORANGE);
        TitledBorder titledBorder = BorderFactory.createTitledBorder(configBorder,"Potions");
        titledBorder.setTitleColor(Color.ORANGE);
        potionSetting.setBorder(titledBorder);
        potionSetting.setPreferredSize(new Dimension(500,155));
        content.add(potionSetting);

        //---- potionRangedLabel ----
        potionRangedLabel.setText("Ranging Potion Name:");
        potionSetting.add(potionRangedLabel);

        //---- rangePotionTextField ----
        rangePotionTextField.setText("Divine ranging potion(4)");
        rangePotionTextField.setToolTipText(VorkathToolTip.DEFAULT_REMINDER);
        potionSetting.add(rangePotionTextField);

        //---- antifirePotionLabel ----
        antifirePotionLabel.setText("Antifire Potion Name:");
        potionSetting.add(antifirePotionLabel);

        //---- antifirePotionTextField ----
        antifirePotionTextField.setText("Extended super antifire(4)");
        antifirePotionTextField.setToolTipText(VorkathToolTip.DEFAULT_REMINDER);
        potionSetting.add(antifirePotionTextField);

        //---- prayerPotionLabel ----
        prayerPotionLabel.setText("Prayer Potion Name:");
        potionSetting.add(prayerPotionLabel);

        //---- prayerPotionTextField ----
        prayerPotionTextField.setText("Prayer potion(4)");
        prayerPotionTextField.setToolTipText(VorkathToolTip.DEFAULT_REMINDER);
        potionSetting.add(prayerPotionTextField);

        //---- prayerPotionAmountLabel ----
        prayerPotionAmountLabel.setText("Prayer Amount:");
        potionSetting.add(prayerPotionAmountLabel);

        //---- prayerPotionAmountTextField ----
        prayerPotionAmountTextField.setText("2");
        potionSetting.add(prayerPotionAmountTextField);

        //---- venomPotionLabel ----
        venomPotionLabel.setText("Venom Potion Name:");
        potionSetting.add(venomPotionLabel);

        //---- venomPotionTextField ----
        venomPotionTextField.setText("Anti-venom+(4)");
        venomPotionTextField.setToolTipText(VorkathToolTip.DEFAULT_REMINDER);
        potionSetting.add(venomPotionTextField);

        /*
            Potion Setting Config End
         */

        /*
            Food Setting Config Start
         */
        DreamPanel foodSetting = new DreamPanel(new GridLayout(0, 1));
        titledBorder = BorderFactory.createTitledBorder(configBorder,"Food");
        titledBorder.setTitleColor(Color.ORANGE);
        foodSetting.setBorder(titledBorder);
        foodSetting.setPreferredSize(new Dimension(500,50));
        content.add(foodSetting);

        //---- foodNameLabel ----
        foodNameLabel.setText("Food Name:");
        foodNameLabel.setToolTipText(VorkathToolTip.USE_MAIN_FOOD);
        foodSetting.add(foodNameLabel);

        //---- foodNameTextField ----
        foodNameTextField.setText("Manta ray");
        foodNameTextField.setToolTipText(VorkathToolTip.USE_MAIN_FOOD);
        foodSetting.add(foodNameTextField);

        //---- secondaryFoodNameLabel ----
        secondaryFoodNameLabel.setText("Secondary Food Name:");
        secondaryFoodNameLabel.setToolTipText(VorkathToolTip.USE_SECONDARY_FOOD);
        foodSetting.add(secondaryFoodNameLabel);

        //---- secondaryFoodNameTextField ----
        secondaryFoodNameTextField.setText("Lobster");
        secondaryFoodNameTextField.setToolTipText(VorkathToolTip.USE_SECONDARY_FOOD);
        foodSetting.add(secondaryFoodNameTextField);
        /*
            Food Setting Config End
         */

        combatConfigBody.setBorder(new EmptyBorder(7,8,7,8));
        combatConfigBody.add(combatContent = new DreamPanel(new GridLayout(0, 1)), BorderLayout.NORTH);

        /*
         * Weapon 1 config start
         */
        DreamPanel weaponCrossbow = new DreamPanel(new GridLayout(0, 1));
        titledBorder = BorderFactory.createTitledBorder(configBorder,"Crossbow Mode");
        titledBorder.setTitleColor(Color.ORANGE);
        weaponCrossbow.setBorder(titledBorder);
        weaponCrossbow.setPreferredSize(new Dimension(500,160));
        combatContent.add(weaponCrossbow);

        //---- allowCrossbowLabel ----
        allowCrossbowLabel.setText("Use Crossbow:");
        weaponCrossbow.add(allowCrossbowLabel);

        //---- allowCrossbowCheckbox ----
        //allowCrossbowCheckbox.addChangeListener(this::allowCrossbowCheckboxStateChanged);
        allowCrossbowCheckbox.setFont(customFont);
        allowCrossbowCheckbox.setForeground(Color.ORANGE);
        weaponCrossbow.add(allowCrossbowCheckbox);

        //---- primaryBoltNameLabel ----
        primaryBoltNameLabel.setText("Primary Bolt:");
        weaponCrossbow.add(primaryBoltNameLabel);

        //---- primaryBoltNameTextField ----
        primaryBoltNameTextField.setText("Ruby dragon bolts (e)");
        primaryBoltNameTextField.setEnabled(false);
        primaryBoltNameTextField.setToolTipText(VorkathToolTip.USE_PRIMARY_BOLT);
        weaponCrossbow.add(primaryBoltNameTextField);

        //---- allowSecondaryLabel ----
        allowSecondaryLabel.setText("Allow Secondary:  ");
        weaponCrossbow.add(allowSecondaryLabel);

        //---- allowSecondaryCheckbox ----
//        allowSecondaryCheckbox.addChangeListener(this::allowSecondaryCheckboxStateChanged);
        allowSecondaryCheckbox.setForeground(Color.ORANGE);
        weaponCrossbow.add(allowSecondaryCheckbox);

        //---- secondaryBoltNameLabel ----
        secondaryBoltNameLabel.setText("Secondary Bolt:    ");
        weaponCrossbow.add(secondaryBoltNameLabel);

        //---- secondaryBoltNameTextField ----
        secondaryBoltNameTextField.setText("Diamond dragon bolts (e)");
        secondaryBoltNameTextField.setEnabled(false);
        secondaryBoltNameTextField.setToolTipText(VorkathToolTip.USE_SECONDARY_BOLT);
        weaponCrossbow.add(secondaryBoltNameTextField);

        DreamPanel weaponBlowpipe = new DreamPanel(new GridLayout(0, 1));
        titledBorder = BorderFactory.createTitledBorder(configBorder,"Blowpipe Mode");
        titledBorder.setTitleColor(Color.ORANGE);
        weaponBlowpipe.setBorder(titledBorder);
        weaponBlowpipe.setPreferredSize(new Dimension(500,50));
        combatContent.add(weaponBlowpipe);

        //---- allowBlowpipeLabel ----
        allowBlowpipeLabel.setText("Use Blowpipe:");
        weaponBlowpipe.add(allowBlowpipeLabel);

        //---- allowBlowpipeCheckbox ----
//        allowBlowpipeCheckbox.addChangeListener(this::allowBlowpipeCheckboxStateChanged);
        weaponBlowpipe.add(allowBlowpipeCheckbox);

        //---- dartNameLabel ----
        dartNameLabel.setText("Dart name:");
        weaponBlowpipe.add(dartNameLabel);

        //---- dartNameTextField ----
        dartNameTextField.setText("Rune dart");
        dartNameTextField.setEnabled(false);
        dartNameTextField.setToolTipText(VorkathToolTip.USE_DART);
        weaponBlowpipe.add(dartNameTextField);

        //---- allowSpecialLabel ----
        allowSpecialLabel.setText("Use Special Attack:");
        allowSpecialLabel.setToolTipText(VorkathToolTip.USE_SPECIAL);
        weaponBlowpipe.add(allowSpecialLabel);

        //---- specialAttackType ----
        specialAttackType.setSize(300, 40);
        specialAttackType.setToolTipText(VorkathToolTip.USE_SPECIAL);
        weaponBlowpipe.add(specialAttackType);


        /*
            TRAVEL CONFIG
         */
        DreamPanel houseSettings = new DreamPanel(new GridLayout(0, 1));
        titledBorder = BorderFactory.createTitledBorder(configBorder,"House Settings");
        titledBorder.setTitleColor(Color.ORANGE);
        houseSettings.setBorder(titledBorder);
        houseSettings.setMaximumSize(new Dimension(500, 100));
        houseSettings.setPreferredSize(new Dimension(500,50));
        travelConfigBody.add(houseSettings);

        DreamPanel houseNexusOptions = new DreamPanel(new GridLayout(0, 4, 0, 0));
        houseNexusOptions.setPreferredSize(new Dimension(500,50));

        travelSettingHouseNexusLabel.setText("Use House Nexus:");
        travelSettingHouseNexusLabel.setToolTipText(VorkathToolTip.USE_HOUSE_NEXUS);
        houseNexusOptions.add(travelSettingHouseNexusLabel);

        //---- travelSettingUseNexusCheckbox ----
//        travelSettingUseNexusCheckbox.addChangeListener(this::travelSettingUseNexusCheckboxStateChanged);
        houseNexusOptions.add(travelSettingUseNexusCheckbox);

        //---- nexusTeleportsCombobox ----
        nexusTeleportsCombobox.setModel(new DefaultComboBoxModel<>(NexusTeleport.values()));
        nexusTeleportsCombobox.setPreferredSize(new Dimension(250, 50));
        nexusTeleportsCombobox.setMaximumSize(nexusTeleportsCombobox.getPreferredSize());
        nexusTeleportsCombobox.setEnabled(false);
        houseNexusOptions.add(nexusTeleportsCombobox);

        houseSettings.add(houseNexusOptions);

        //---- travelSettingUseLunarPortalLabel ----
        travelSettingUseLunarPortalLabel.setText("Use Lunar Portal:");
        houseSettings.add(travelSettingUseLunarPortalLabel);

        //---- travelSettingUseLunarPortalCheckbox ----
//        travelSettingUseLunarPortalCheckbox.addChangeListener(this::travelSettingUseUseLunarCheckboxStateChanged);
        houseSettings.add(travelSettingUseLunarPortalCheckbox);

        DreamPanel otherSettings = new DreamPanel(new GridLayout(0, 1));
        titledBorder = BorderFactory.createTitledBorder(configBorder,"Other Settings");
        titledBorder.setTitleColor(Color.ORANGE);
        otherSettings.setBorder(titledBorder);
        otherSettings.setMaximumSize(new Dimension(500, 100));
        otherSettings.setPreferredSize(new Dimension(500,50));
        travelConfigBody.add(otherSettings);
//
//        //---- travelSettingUseRejuvPoolLabel ----
//        travelSettingUseRejuvPoolLabel.setText("Use Rejuv Pool:");
//        travelSettingUseRejuvPoolLabel.setFont(travelSettingUseRejuvPoolLabel.getFont().deriveFont(travelSettingUseRejuvPoolLabel.getFont().getSize() + 3f));
//        tPane.add(travelSettingUseRejuvPoolLabel);
//        travelSettingUseRejuvPoolLabel.setBounds(25, 430, 125, 17);
//
//        //---- travelSettingUseRejuvPoolCheckbox ----
//        travelSettingUseRejuvPoolCheckbox.setFont(travelSettingUseRejuvPoolCheckbox.getFont().deriveFont(travelSettingUseRejuvPoolCheckbox.getFont().getSize() + 2f));
//        tPane.add(travelSettingUseRejuvPoolCheckbox);
//        travelSettingUseRejuvPoolCheckbox.setBounds(155, 425, 21, 28);
//
//        //---- travelSettingUseAltarLabel ----
//        travelSettingUseAltarLabel.setText("Use House Altar:");
//        travelSettingUseAltarLabel.setFont(travelSettingUseAltarLabel.getFont().deriveFont(travelSettingUseAltarLabel.getFont().getSize() + 3f));
//        tPane.add(travelSettingUseAltarLabel);
//        travelSettingUseAltarLabel.setBounds(25, 460, 125, 17);
//
//        //---- travelSettingUseAltarCheckbox ----
//        travelSettingUseAltarCheckbox.setFont(travelSettingUseAltarCheckbox.getFont().deriveFont(travelSettingUseAltarCheckbox.getFont().getSize() + 2f));
//        tPane.add(travelSettingUseAltarCheckbox);
//        travelSettingUseAltarCheckbox.setBounds(155, 455, 21, 28);
//
//        //---- scriptConditionsLabel ----
//        scriptConditionsLabel.setText("Script Conditions:");
//        scriptConditionsLabel.setForeground(Color.ORANGE);
//        scriptConditionsLabel.setFont(scriptConditionsLabel.getFont().deriveFont(scriptConditionsLabel.getFont().getStyle() | Font.BOLD, scriptConditionsLabel.getFont().getSize() + 5f));
//        tPane.add(scriptConditionsLabel);
//        scriptConditionsLabel.setBounds(20, 490, 177, 20);
//
//        //---- scriptConditionsPetLabel ----
//        scriptConditionsPetLabel.setText("Stop When Pet:");
//        scriptConditionsPetLabel.setFont(scriptConditionsPetLabel.getFont().deriveFont(scriptConditionsPetLabel.getFont().getSize() + 3f));
//        tPane.add(scriptConditionsPetLabel);
//        scriptConditionsPetLabel.setBounds(25, 520, 120, 17);
//
//        //---- scriptConditionsPetCheckbox ----
//        scriptConditionsPetCheckbox.setFont(scriptConditionsPetCheckbox.getFont().deriveFont(scriptConditionsPetCheckbox.getFont().getSize() + 2f));
//        tPane.add(scriptConditionsPetCheckbox);
//        scriptConditionsPetCheckbox.setBounds(155, 515, 21, 28);
//
//        //---- scriptConditionsKillLabel ----
//        scriptConditionsKillLabel.setText("Stop When X Kills:  ");
//        scriptConditionsKillLabel.setFont(scriptConditionsKillLabel.getFont().deriveFont(scriptConditionsKillLabel.getFont().getSize() + 3f));
//        tPane.add(scriptConditionsKillLabel);
//        scriptConditionsKillLabel.setBounds(25, 550, 145, 17);
//
//        //---- scriptConditionsKillCheckbox ----
//        scriptConditionsKillCheckbox.setFont(scriptConditionsKillCheckbox.getFont().deriveFont(scriptConditionsKillCheckbox.getFont().getSize() + 2f));
//        scriptConditionsKillCheckbox.addChangeListener(this::scriptConditionsKillCheckboxStateChanged);
//        tPane.add(scriptConditionsKillCheckbox);
//        scriptConditionsKillCheckbox.setBounds(155, 545, 21, 28);
//
//        //---- killAmountLabel ----
//        killAmountLabel.setText("Amount:");
//        killAmountLabel.setFont(killAmountLabel.getFont().deriveFont(killAmountLabel.getFont().getSize() + 3f));
//        tPane.add(killAmountLabel);
//        killAmountLabel.setBounds(195, 550, 70, 17);
//
//        //---- killAmountTextField ----
//        killAmountTextField.setFont(killAmountTextField.getFont().deriveFont(killAmountTextField.getFont().getSize() + 2f));
//        killAmountTextField.setText("1,000");
//        killAmountTextField.setEnabled(false);
//        tPane.add(killAmountTextField);
//        killAmountTextField.setBounds(260, 540, 55, 27);
//
//        //---- scriptConditionsProfitLabel ----
//        scriptConditionsProfitLabel.setText("Stop When X $$$:");
//        scriptConditionsProfitLabel.setFont(scriptConditionsProfitLabel.getFont().deriveFont(scriptConditionsProfitLabel.getFont().getSize() + 3f));
//        tPane.add(scriptConditionsProfitLabel);
//        scriptConditionsProfitLabel.setBounds(25, 580, 125, 17);
//
//        //---- scriptConditionsProfitCheckbox ----
//        scriptConditionsProfitCheckbox.setFont(scriptConditionsProfitCheckbox.getFont().deriveFont(scriptConditionsProfitCheckbox.getFont().getSize() + 2f));
//        scriptConditionsProfitCheckbox.addChangeListener(this::scriptConditionsProfitCheckboxStateChanged);
//        tPane.add(scriptConditionsProfitCheckbox);
//        scriptConditionsProfitCheckbox.setBounds(155, 575, 21, 28);
//
//        //---- profitAmountLabel ----
//        profitAmountLabel.setText("Amount:");
//        profitAmountLabel.setFont(profitAmountLabel.getFont().deriveFont(profitAmountLabel.getFont().getSize() + 3f));
//        tPane.add(profitAmountLabel);
//        profitAmountLabel.setBounds(195, 580, 70, 17);
//
//        //---- profitAmountTextField ----
//        profitAmountTextField.setFont(profitAmountTextField.getFont().deriveFont(profitAmountTextField.getFont().getSize() + 2f));
//        profitAmountTextField.setText("1,000,000");
//        profitAmountTextField.setEnabled(false);
//        tPane.add(profitAmountTextField);
//        profitAmountTextField.setBounds(260, 575, 95, 27);
//
//
//
//        //---- instanceConditionLabel ----
//        instanceConditionLabel.setText("Instance Conditions:");
//        instanceConditionLabel.setForeground(Color.ORANGE);
//        instanceConditionLabel.setFont(instanceConditionLabel.getFont().deriveFont(instanceConditionLabel.getFont().getStyle() | Font.BOLD, instanceConditionLabel.getFont().getSize() + 5f));
//        tPane.add(instanceConditionLabel);
//        instanceConditionLabel.setBounds(20, 635, 177, 20);
//
//        //---- scriptConditionsKillsPerInstanceLabel ----
//        scriptConditionsKillsPerInstanceLabel.setText("Kills Per Instance:    ");
//        scriptConditionsKillsPerInstanceLabel.setFont(scriptConditionsKillsPerInstanceLabel.getFont().deriveFont(scriptConditionsKillsPerInstanceLabel.getFont().getSize() + 3f));
//        tPane.add(scriptConditionsKillsPerInstanceLabel);
//        scriptConditionsKillsPerInstanceLabel.setBounds(25, 660, 145, 17);
//
//        //---- killPerInstanceAmountTextField ----
//        killPerInstanceAmountTextField.setFont(killPerInstanceAmountTextField.getFont().deriveFont(killPerInstanceAmountTextField.getFont().getSize() + 2f));
//        killPerInstanceAmountTextField.setText("2");
//        killPerInstanceAmountTextField.setEnabled(false);
//        tPane.add(killPerInstanceAmountTextField);
//        killPerInstanceAmountTextField.setBounds(195, 655, 30, 27);
//
//        //---- instanceConditionsKillsPerInstanceCheckbox ----
//        instanceConditionsKillsPerInstanceCheckbox.setFont(instanceConditionsKillsPerInstanceCheckbox.getFont().deriveFont(instanceConditionsKillsPerInstanceCheckbox.getFont().getSize() + 2f));
//        instanceConditionsKillsPerInstanceCheckbox.addChangeListener(this::instanceConditionsKillsPerInstanceCheckboxStateChanged);
//        tPane.add(instanceConditionsKillsPerInstanceCheckbox);
//        instanceConditionsKillsPerInstanceCheckbox.setBounds(155, 655, 21, 28);
//
//        //---- travelSettingUseClanwarsLabel ----
//        travelSettingUseClanwarsLabel.setText("Use Clan Wars:    ");
//        travelSettingUseClanwarsLabel.setFont(travelSettingUseClanwarsLabel.getFont().deriveFont(travelSettingUseClanwarsLabel.getFont().getSize() + 3f));
//        tPane.add(travelSettingUseClanwarsLabel);
//        travelSettingUseClanwarsLabel.setBounds(195, 395, 130, 17);
//
//        //---- travelSettingUseClanwarsCheckbox ----
//        travelSettingUseClanwarsCheckbox.setFont(travelSettingUseClanwarsCheckbox.getFont().deriveFont(travelSettingUseClanwarsCheckbox.getFont().getSize() + 2f));
//        travelSettingUseClanwarsCheckbox.addChangeListener(this::travelSettingUseUseClanwarsCheckboxStateChanged);
//        tPane.add(travelSettingUseClanwarsCheckbox);
//        travelSettingUseClanwarsCheckbox.setBounds(310, 390, 21, 28);
//
//        //---- startButton ----
//        startButton.setText("Start Script");
//        startButton.addActionListener(this::startButtonActionPerformed);
//        tPane.add(startButton);
//        startButton.setBounds(515, 390, 180, 73);
//
//        //---- saveButton ----
//        saveButton.setText("Save Settings");
//        saveButton.addActionListener(this::saveButtonActionPerformed);
//        tPane.add(saveButton);
//        saveButton.setBounds(515, 480, 180, 73);
//
//        //---- loadButton ----
//        loadButton.setText("Load Settings");
//        loadButton.addActionListener(this::loadButtonActionPerformed);
//        tPane.add(loadButton);
//        loadButton.setBounds(515, 570, 180, 73);
//
//

    }

    public static void main(String... args) throws IOException {
        ScriptFrame frame = new ScriptFrame();
        frame.setVisible(true);
    }
}
