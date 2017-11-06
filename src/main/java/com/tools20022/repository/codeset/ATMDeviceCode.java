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
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCustomerConsole
 * ATMDeviceCode.mmCustomerConsole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmDocumentPrinter
 * ATMDeviceCode.mmDocumentPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmJournal
 * ATMDeviceCode.mmJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmJournalPrinter
 * ATMDeviceCode.mmJournalPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmReceiptPrinter
 * ATMDeviceCode.mmReceiptPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmWithdrawalReceipt
 * ATMDeviceCode.mmWithdrawalReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmAlarmSensors
 * ATMDeviceCode.mmAlarmSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmBarCodeReader
 * ATMDeviceCode.mmBarCodeReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCamera
 * ATMDeviceCode.mmCamera}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCardDispenser
 * ATMDeviceCode.mmCardDispenser}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCardUnit
 * ATMDeviceCode.mmCardUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCashInModule
 * ATMDeviceCode.mmCashInModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCashRecycler
 * ATMDeviceCode.mmCashRecycler}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCashDispenser
 * ATMDeviceCode.mmCashDispenser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmCheckReader
 * ATMDeviceCode.mmCheckReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmDeposit
 * ATMDeviceCode.mmDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmDoorSensors
 * ATMDeviceCode.mmDoorSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmInputProcessingModule
 * ATMDeviceCode.mmInputProcessingModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmOtherSensor
 * ATMDeviceCode.mmOtherSensor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmPassbookPrinter
 * ATMDeviceCode.mmPassbookPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmPINKeypad
 * ATMDeviceCode.mmPINKeypad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode#mmScannerPrinter
 * ATMDeviceCode.mmScannerPrinter}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMCode mmCustomerConsole = new MMCode() {
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
	public static final MMCode mmDocumentPrinter = new MMCode() {
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
	public static final MMCode mmJournal = new MMCode() {
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
	public static final MMCode mmJournalPrinter = new MMCode() {
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
	public static final MMCode mmReceiptPrinter = new MMCode() {
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
	public static final MMCode mmWithdrawalReceipt = new MMCode() {
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
	public static final MMCode mmAlarmSensors = new MMCode() {
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
	public static final MMCode mmBarCodeReader = new MMCode() {
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
	public static final MMCode mmCamera = new MMCode() {
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
	public static final MMCode mmCardDispenser = new MMCode() {
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
	public static final MMCode mmCardUnit = new MMCode() {
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
	public static final MMCode mmCashInModule = new MMCode() {
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
	public static final MMCode mmCashRecycler = new MMCode() {
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
	public static final MMCode mmCashDispenser = new MMCode() {
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
	public static final MMCode mmCheckReader = new MMCode() {
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
	public static final MMCode mmDeposit = new MMCode() {
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
	public static final MMCode mmDoorSensors = new MMCode() {
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
	public static final MMCode mmInputProcessingModule = new MMCode() {
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
	public static final MMCode mmOtherSensor = new MMCode() {
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
	public static final MMCode mmPassbookPrinter = new MMCode() {
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
	public static final MMCode mmPINKeypad = new MMCode() {
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
	public static final MMCode mmScannerPrinter = new MMCode() {
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMDeviceCode";
				definition = "ATM devices.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMDeviceCode.mmCustomerConsole, com.tools20022.repository.codeset.ATMDeviceCode.mmDocumentPrinter,
						com.tools20022.repository.codeset.ATMDeviceCode.mmJournal, com.tools20022.repository.codeset.ATMDeviceCode.mmJournalPrinter, com.tools20022.repository.codeset.ATMDeviceCode.mmReceiptPrinter,
						com.tools20022.repository.codeset.ATMDeviceCode.mmWithdrawalReceipt, com.tools20022.repository.codeset.ATMDeviceCode.mmAlarmSensors, com.tools20022.repository.codeset.ATMDeviceCode.mmBarCodeReader,
						com.tools20022.repository.codeset.ATMDeviceCode.mmCamera, com.tools20022.repository.codeset.ATMDeviceCode.mmCardDispenser, com.tools20022.repository.codeset.ATMDeviceCode.mmCardUnit,
						com.tools20022.repository.codeset.ATMDeviceCode.mmCashInModule, com.tools20022.repository.codeset.ATMDeviceCode.mmCashRecycler, com.tools20022.repository.codeset.ATMDeviceCode.mmCashDispenser,
						com.tools20022.repository.codeset.ATMDeviceCode.mmCheckReader, com.tools20022.repository.codeset.ATMDeviceCode.mmDeposit, com.tools20022.repository.codeset.ATMDeviceCode.mmDoorSensors,
						com.tools20022.repository.codeset.ATMDeviceCode.mmInputProcessingModule, com.tools20022.repository.codeset.ATMDeviceCode.mmOtherSensor, com.tools20022.repository.codeset.ATMDeviceCode.mmPassbookPrinter,
						com.tools20022.repository.codeset.ATMDeviceCode.mmPINKeypad, com.tools20022.repository.codeset.ATMDeviceCode.mmScannerPrinter);
				derivation_lazy = () -> Arrays.asList(ATMDevice2Code.mmObject(), ATMDevice1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}