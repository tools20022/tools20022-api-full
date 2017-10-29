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
import com.tools20022.repository.codeset.ATMDeviceCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List of ATM devices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode ATMDeviceCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#AlarmSensors
 * ATMDevice2Code.AlarmSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#BarCodeReader
 * ATMDevice2Code.BarCodeReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#Camera
 * ATMDevice2Code.Camera}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CardDispenser
 * ATMDevice2Code.CardDispenser}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CardUnit
 * ATMDevice2Code.CardUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CashDispenser
 * ATMDevice2Code.CashDispenser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CashInModule
 * ATMDevice2Code.CashInModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CashRecycler
 * ATMDevice2Code.CashRecycler}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CheckReader
 * ATMDevice2Code.CheckReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#CustomerConsole
 * ATMDevice2Code.CustomerConsole}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#Deposit
 * ATMDevice2Code.Deposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#DocumentPrinter
 * ATMDevice2Code.DocumentPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#DoorSensors
 * ATMDevice2Code.DoorSensors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#InputProcessingModule
 * ATMDevice2Code.InputProcessingModule}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#Journal
 * ATMDevice2Code.Journal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#JournalPrinter
 * ATMDevice2Code.JournalPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#OtherSensor
 * ATMDevice2Code.OtherSensor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#PassbookPrinter
 * ATMDevice2Code.PassbookPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice2Code#PINKeypad
 * ATMDevice2Code.PINKeypad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#ReceiptPrinter
 * ATMDevice2Code.ReceiptPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#ScannerPrinter
 * ATMDevice2Code.ScannerPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code#WithdrawalReceipt
 * ATMDevice2Code.WithdrawalReceipt}</li>
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
 * "ATMDevice2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "List of ATM devices."</li>
 * </ul>
 */
public class ATMDevice2Code extends ATMDeviceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlarmSensors"</li>
	 * </ul>
	 */
	public static final MMCode AlarmSensors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlarmSensors";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCodeReader"</li>
	 * </ul>
	 */
	public static final MMCode BarCodeReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCodeReader";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Camera"</li>
	 * </ul>
	 */
	public static final MMCode Camera = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Camera";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDispenser"</li>
	 * </ul>
	 */
	public static final MMCode CardDispenser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDispenser";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardUnit"</li>
	 * </ul>
	 */
	public static final MMCode CardUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnit";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDispenser"</li>
	 * </ul>
	 */
	public static final MMCode CashDispenser = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDispenser";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInModule"</li>
	 * </ul>
	 */
	public static final MMCode CashInModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInModule";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRecycler"</li>
	 * </ul>
	 */
	public static final MMCode CashRecycler = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRecycler";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckReader"</li>
	 * </ul>
	 */
	public static final MMCode CheckReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckReader";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConsole"</li>
	 * </ul>
	 */
	public static final MMCode CustomerConsole = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsole";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * </ul>
	 */
	public static final MMCode Deposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentPrinter"</li>
	 * </ul>
	 */
	public static final MMCode DocumentPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPrinter";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoorSensors"</li>
	 * </ul>
	 */
	public static final MMCode DoorSensors = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoorSensors";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InputProcessingModule"</li>
	 * </ul>
	 */
	public static final MMCode InputProcessingModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InputProcessingModule";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Journal"</li>
	 * </ul>
	 */
	public static final MMCode Journal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Journal";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalPrinter"</li>
	 * </ul>
	 */
	public static final MMCode JournalPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalPrinter";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSensor"</li>
	 * </ul>
	 */
	public static final MMCode OtherSensor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSensor";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassbookPrinter"</li>
	 * </ul>
	 */
	public static final MMCode PassbookPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassbookPrinter";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINKeypad"</li>
	 * </ul>
	 */
	public static final MMCode PINKeypad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINKeypad";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPrinter"</li>
	 * </ul>
	 */
	public static final MMCode ReceiptPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinter";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScannerPrinter"</li>
	 * </ul>
	 */
	public static final MMCode ScannerPrinter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScannerPrinter";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReceipt"</li>
	 * </ul>
	 */
	public static final MMCode WithdrawalReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReceipt";
			owner_lazy = () -> ATMDevice2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMDevice2Code";
				definition = "List of ATM devices.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMDevice2Code.AlarmSensors, com.tools20022.repository.codeset.ATMDevice2Code.BarCodeReader, com.tools20022.repository.codeset.ATMDevice2Code.Camera,
						com.tools20022.repository.codeset.ATMDevice2Code.CardDispenser, com.tools20022.repository.codeset.ATMDevice2Code.CardUnit, com.tools20022.repository.codeset.ATMDevice2Code.CashDispenser,
						com.tools20022.repository.codeset.ATMDevice2Code.CashInModule, com.tools20022.repository.codeset.ATMDevice2Code.CashRecycler, com.tools20022.repository.codeset.ATMDevice2Code.CheckReader,
						com.tools20022.repository.codeset.ATMDevice2Code.CustomerConsole, com.tools20022.repository.codeset.ATMDevice2Code.Deposit, com.tools20022.repository.codeset.ATMDevice2Code.DocumentPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.DoorSensors, com.tools20022.repository.codeset.ATMDevice2Code.InputProcessingModule, com.tools20022.repository.codeset.ATMDevice2Code.Journal,
						com.tools20022.repository.codeset.ATMDevice2Code.JournalPrinter, com.tools20022.repository.codeset.ATMDevice2Code.OtherSensor, com.tools20022.repository.codeset.ATMDevice2Code.PassbookPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.PINKeypad, com.tools20022.repository.codeset.ATMDevice2Code.ReceiptPrinter, com.tools20022.repository.codeset.ATMDevice2Code.ScannerPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.WithdrawalReceipt);
				trace_lazy = () -> ATMDeviceCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}