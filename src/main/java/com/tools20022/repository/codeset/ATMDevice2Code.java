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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ATMDevice2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of ATM devices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMDeviceCode ATMDeviceCode}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMDevice2Code extends MMCode {

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
	public static final ATMDevice2Code AlarmSensors = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlarmSensors";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.AlarmSensors.getCodeName().orElse(name);
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
	public static final ATMDevice2Code BarCodeReader = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCodeReader";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.BarCodeReader.getCodeName().orElse(name);
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
	public static final ATMDevice2Code Camera = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Camera";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.Camera.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CardDispenser = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDispenser";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CardDispenser.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CardUnit = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CardUnit.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CashDispenser = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDispenser";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CashDispenser.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CashInModule = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInModule";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CashInModule.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CashRecycler = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRecycler";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CashRecycler.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CheckReader = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckReader";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CheckReader.getCodeName().orElse(name);
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
	public static final ATMDevice2Code CustomerConsole = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsole";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.CustomerConsole.getCodeName().orElse(name);
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
	public static final ATMDevice2Code Deposit = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.Deposit.getCodeName().orElse(name);
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
	public static final ATMDevice2Code DocumentPrinter = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.DocumentPrinter.getCodeName().orElse(name);
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
	public static final ATMDevice2Code DoorSensors = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoorSensors";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.DoorSensors.getCodeName().orElse(name);
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
	public static final ATMDevice2Code InputProcessingModule = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InputProcessingModule";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.InputProcessingModule.getCodeName().orElse(name);
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
	public static final ATMDevice2Code Journal = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Journal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.Journal.getCodeName().orElse(name);
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
	public static final ATMDevice2Code JournalPrinter = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.JournalPrinter.getCodeName().orElse(name);
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
	public static final ATMDevice2Code OtherSensor = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSensor";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.OtherSensor.getCodeName().orElse(name);
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
	public static final ATMDevice2Code PassbookPrinter = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassbookPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.PassbookPrinter.getCodeName().orElse(name);
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
	public static final ATMDevice2Code PINKeypad = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINKeypad";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.PINKeypad.getCodeName().orElse(name);
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
	public static final ATMDevice2Code ReceiptPrinter = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.ReceiptPrinter.getCodeName().orElse(name);
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
	public static final ATMDevice2Code ScannerPrinter = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScannerPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.ScannerPrinter.getCodeName().orElse(name);
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
	public static final ATMDevice2Code WithdrawalReceipt = new ATMDevice2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice2Code.mmObject();
			codeName = ATMDeviceCode.WithdrawalReceipt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMDevice2Code> codesByName = new LinkedHashMap<>();

	protected ATMDevice2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDevice2Code";
				definition = "List of ATM devices.";
				trace_lazy = () -> ATMDeviceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMDevice2Code.AlarmSensors, com.tools20022.repository.codeset.ATMDevice2Code.BarCodeReader, com.tools20022.repository.codeset.ATMDevice2Code.Camera,
						com.tools20022.repository.codeset.ATMDevice2Code.CardDispenser, com.tools20022.repository.codeset.ATMDevice2Code.CardUnit, com.tools20022.repository.codeset.ATMDevice2Code.CashDispenser,
						com.tools20022.repository.codeset.ATMDevice2Code.CashInModule, com.tools20022.repository.codeset.ATMDevice2Code.CashRecycler, com.tools20022.repository.codeset.ATMDevice2Code.CheckReader,
						com.tools20022.repository.codeset.ATMDevice2Code.CustomerConsole, com.tools20022.repository.codeset.ATMDevice2Code.Deposit, com.tools20022.repository.codeset.ATMDevice2Code.DocumentPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.DoorSensors, com.tools20022.repository.codeset.ATMDevice2Code.InputProcessingModule, com.tools20022.repository.codeset.ATMDevice2Code.Journal,
						com.tools20022.repository.codeset.ATMDevice2Code.JournalPrinter, com.tools20022.repository.codeset.ATMDevice2Code.OtherSensor, com.tools20022.repository.codeset.ATMDevice2Code.PassbookPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.PINKeypad, com.tools20022.repository.codeset.ATMDevice2Code.ReceiptPrinter, com.tools20022.repository.codeset.ATMDevice2Code.ScannerPrinter,
						com.tools20022.repository.codeset.ATMDevice2Code.WithdrawalReceipt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlarmSensors.getCodeName().get(), AlarmSensors);
		codesByName.put(BarCodeReader.getCodeName().get(), BarCodeReader);
		codesByName.put(Camera.getCodeName().get(), Camera);
		codesByName.put(CardDispenser.getCodeName().get(), CardDispenser);
		codesByName.put(CardUnit.getCodeName().get(), CardUnit);
		codesByName.put(CashDispenser.getCodeName().get(), CashDispenser);
		codesByName.put(CashInModule.getCodeName().get(), CashInModule);
		codesByName.put(CashRecycler.getCodeName().get(), CashRecycler);
		codesByName.put(CheckReader.getCodeName().get(), CheckReader);
		codesByName.put(CustomerConsole.getCodeName().get(), CustomerConsole);
		codesByName.put(Deposit.getCodeName().get(), Deposit);
		codesByName.put(DocumentPrinter.getCodeName().get(), DocumentPrinter);
		codesByName.put(DoorSensors.getCodeName().get(), DoorSensors);
		codesByName.put(InputProcessingModule.getCodeName().get(), InputProcessingModule);
		codesByName.put(Journal.getCodeName().get(), Journal);
		codesByName.put(JournalPrinter.getCodeName().get(), JournalPrinter);
		codesByName.put(OtherSensor.getCodeName().get(), OtherSensor);
		codesByName.put(PassbookPrinter.getCodeName().get(), PassbookPrinter);
		codesByName.put(PINKeypad.getCodeName().get(), PINKeypad);
		codesByName.put(ReceiptPrinter.getCodeName().get(), ReceiptPrinter);
		codesByName.put(ScannerPrinter.getCodeName().get(), ScannerPrinter);
		codesByName.put(WithdrawalReceipt.getCodeName().get(), WithdrawalReceipt);
	}

	public static ATMDevice2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMDevice2Code[] values() {
		ATMDevice2Code[] values = new ATMDevice2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMDevice2Code> {
		@Override
		public ATMDevice2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMDevice2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}