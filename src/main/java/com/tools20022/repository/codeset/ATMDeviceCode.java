/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ATM devices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CustomerConsole
 * ATMDeviceCode.CustomerConsole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#DocumentPrinter
 * ATMDeviceCode.DocumentPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#Journal
 * ATMDeviceCode.Journal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#JournalPrinter
 * ATMDeviceCode.JournalPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#ReceiptPrinter
 * ATMDeviceCode.ReceiptPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#WithdrawalReceipt
 * ATMDeviceCode.WithdrawalReceipt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#AlarmSensors
 * ATMDeviceCode.AlarmSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#BarCodeReader
 * ATMDeviceCode.BarCodeReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#Camera
 * ATMDeviceCode.Camera}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CardDispenser
 * ATMDeviceCode.CardDispenser}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CardUnit
 * ATMDeviceCode.CardUnit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CashInModule
 * ATMDeviceCode.CashInModule}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CashRecycler
 * ATMDeviceCode.CashRecycler}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CashDispenser
 * ATMDeviceCode.CashDispenser}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#CheckReader
 * ATMDeviceCode.CheckReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#Deposit
 * ATMDeviceCode.Deposit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#DoorSensors
 * ATMDeviceCode.DoorSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#InputProcessingModule
 * ATMDeviceCode.InputProcessingModule}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#OtherSensor
 * ATMDeviceCode.OtherSensor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#PassbookPrinter
 * ATMDeviceCode.PassbookPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#PINKeypad
 * ATMDeviceCode.PINKeypad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#ScannerPrinter
 * ATMDeviceCode.ScannerPrinter}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code
 * ATMDevice2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice1Code
 * ATMDevice1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDeviceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM devices."</li>
 * </ul>
 */
public class ATMDeviceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Customer display and keyboard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConsole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer display and keyboard."</li>
	 * </ul>
	 */
	public static final MMCode CustomerConsole = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsole";
			definition = "Customer display and keyboard.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CDIS";
		}
	};
	/**
	 * Printer for full-size forms documents and supporting the printing of text
	 * and graphic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentPrinter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Printer for full-size forms documents and supporting the printing of text and graphic."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DocumentPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPrinter";
			definition = "Printer for full-size forms documents and supporting the printing of text and graphic.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "DPRN";
		}
	};
	/**
	 * Event log.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JRNL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Journal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event log."</li>
	 * </ul>
	 */
	public static final MMCode Journal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Journal";
			definition = "Event log.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "JRNL";
		}
	};
	/**
	 * Continuous form device used to record a hardcopy audit trail of
	 * transactions, and for certain report printing requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JPRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalPrinter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Continuous form device used to record a hardcopy audit trail of transactions, and for certain report printing requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMCode JournalPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalPrinter";
			definition = "Continuous form device used to record a hardcopy audit trail of transactions, and for certain report printing requirements.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "JPRN";
		}
	};
	/**
	 * Receipt printer used to print cut sheet documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPrinter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receipt printer used to print cut sheet documents."</li>
	 * </ul>
	 */
	public static final MMCode ReceiptPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinter";
			definition = "Receipt printer used to print cut sheet documents.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "RPRN";
		}
	};
	/**
	 * Receipt of the withdrawal transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RWDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receipt of the withdrawal transactions."</li>
	 * </ul>
	 */
	public static final MMCode WithdrawalReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReceipt";
			definition = "Receipt of the withdrawal transactions.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "RWDR";
		}
	};
	/**
	 * Alarm sensors, such as tamper, seismic or heat sensors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlarmSensors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alarm sensors, such as tamper, seismic or heat sensors."</li>
	 * </ul>
	 */
	public static final MMCode AlarmSensors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlarmSensors";
			definition = "Alarm sensors, such as tamper, seismic or heat sensors.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "ALRM";
		}
	};
	/**
	 * Device scanning barcodes using any scanning technology.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCodeReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Device scanning barcodes using any scanning technology."</li>
	 * </ul>
	 */
	public static final MMCode BarCodeReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCodeReader";
			definition = "Device scanning barcodes using any scanning technology.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "BRCD";
		}
	};
	/**
	 * Camera, recorder, video mixer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAMR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Camera"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Camera, recorder, video mixer."</li>
	 * </ul>
	 */
	public static final MMCode Camera = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Camera";
			definition = "Camera, recorder, video mixer.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CAMR";
		}
	};
	/**
	 * Device dispensing card to a consumer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDispenser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Device dispensing card to a consumer."</li>
	 * </ul>
	 */
	public static final MMCode CardDispenser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDispenser";
			definition = "Device dispensing card to a consumer.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CRDD";
		}
	};
	/**
	 * Device to read and optionally write card with various entry modes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device to read and optionally write card with various entry modes."</li>
	 * </ul>
	 */
	public static final MMCode CardUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnit";
			definition = "Device to read and optionally write card with various entry modes.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CRDR";
		}
	};
	/**
	 * Device accepting in-out of items as coupons, documents, bills and coins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device accepting in-out of items as  coupons, documents, bills and coins."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashInModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInModule";
			definition = "Device accepting in-out of items as  coupons, documents, bills and coins.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CSHI";
		}
	};
	/**
	 * Compound device with cash in module, cash dispenser, and cash exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRecycler"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Compound device with cash in module, cash dispenser, and cash exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashRecycler = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRecycler";
			definition = "Compound device with cash in module, cash dispenser, and cash exchange.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CSHR";
		}
	};
	/**
	 * Device dispensing cash in an automated environment, or with an operator
	 * present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDispenser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device dispensing cash in an automated environment, or with an operator present."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CashDispenser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDispenser";
			definition = "Device dispensing cash in an automated environment, or with an operator present.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CSHD";
		}
	};
	/**
	 * Check reader and check image scanner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Check reader and check image scanner."</li>
	 * </ul>
	 */
	public static final MMCode CheckReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckReader";
			definition = "Check reader and check image scanner.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "CHCK";
		}
	};
	/**
	 * Device for the deposit of media in envelopes or deposit of bags
	 * containing bulk media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device for the deposit of media in envelopes or deposit of bags containing bulk media."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Deposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Device for the deposit of media in envelopes or deposit of bags containing bulk media.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "DPST";
		}
	};
	/**
	 * Door sensors, such as cabinet, safe or vandal shield doors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoorSensors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Door sensors, such as cabinet, safe or vandal shield doors."</li>
	 * </ul>
	 */
	public static final MMCode DoorSensors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoorSensors";
			definition = "Door sensors, such as cabinet, safe or vandal shield doors.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "DOOR";
		}
	};
	/**
	 * Self service device processing items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InputProcessingModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Self service device processing items."</li>
	 * </ul>
	 */
	public static final MMCode InputProcessingModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InputProcessingModule";
			definition = "Self service device processing items.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "INPM";
		}
	};
	/**
	 * Other sensors and indicators unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSensor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other sensors and indicators unit."</li>
	 * </ul>
	 */
	public static final MMCode OtherSensor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSensor";
			definition = "Other sensors and indicators unit.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "SNSR";
		}
	};
	/**
	 * Passbook device supporting automatic positioning of the book.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassbookPrinter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Passbook device supporting automatic positioning of the book."</li>
	 * </ul>
	 */
	public static final MMCode PassbookPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassbookPrinter";
			definition = "Passbook device supporting automatic positioning of the book.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "PSBK";
		}
	};
	/**
	 * Hardware security module allowing the PIN (Personal Identification
	 * Number) entry, secure storing of cryptographic keys, and other
	 * cryptographic functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINKeypad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hardware security module allowing the PIN (Personal Identification Number) entry, secure storing of cryptographic keys, and other cryptographic functions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PINKeypad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINKeypad";
			definition = "Hardware security module allowing the PIN (Personal Identification Number) entry, secure storing of cryptographic keys, and other cryptographic functions.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "PINR";
		}
	};
	/**
	 * Device incorporating both the capabilities to scan inserted documents and
	 * optionally to print on them.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode
	 * ATMDeviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScannerPrinter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device incorporating both the capabilities to scan inserted documents and optionally to print on them."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ScannerPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScannerPrinter";
			definition = "Device incorporating both the capabilities to scan inserted documents and optionally to print on them.";
			owner_lazy = () -> ATMDeviceCode.mmObject();
			codeName = "SCAN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMDeviceCode";
				definition = "ATM devices.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMDeviceCode.CustomerConsole, com.tools20022.repository.codeset.ATMDeviceCode.DocumentPrinter, com.tools20022.repository.codeset.ATMDeviceCode.Journal,
						com.tools20022.repository.codeset.ATMDeviceCode.JournalPrinter, com.tools20022.repository.codeset.ATMDeviceCode.ReceiptPrinter, com.tools20022.repository.codeset.ATMDeviceCode.WithdrawalReceipt,
						com.tools20022.repository.codeset.ATMDeviceCode.AlarmSensors, com.tools20022.repository.codeset.ATMDeviceCode.BarCodeReader, com.tools20022.repository.codeset.ATMDeviceCode.Camera,
						com.tools20022.repository.codeset.ATMDeviceCode.CardDispenser, com.tools20022.repository.codeset.ATMDeviceCode.CardUnit, com.tools20022.repository.codeset.ATMDeviceCode.CashInModule,
						com.tools20022.repository.codeset.ATMDeviceCode.CashRecycler, com.tools20022.repository.codeset.ATMDeviceCode.CashDispenser, com.tools20022.repository.codeset.ATMDeviceCode.CheckReader,
						com.tools20022.repository.codeset.ATMDeviceCode.Deposit, com.tools20022.repository.codeset.ATMDeviceCode.DoorSensors, com.tools20022.repository.codeset.ATMDeviceCode.InputProcessingModule,
						com.tools20022.repository.codeset.ATMDeviceCode.OtherSensor, com.tools20022.repository.codeset.ATMDeviceCode.PassbookPrinter, com.tools20022.repository.codeset.ATMDeviceCode.PINKeypad,
						com.tools20022.repository.codeset.ATMDeviceCode.ScannerPrinter);
				derivation_lazy = () -> Arrays.asList(ATMDevice2Code.mmObject(), ATMDevice1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}