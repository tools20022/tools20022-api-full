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
import com.tools20022.repository.codeset.ATMDevice1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * ATM device to output message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code#CustomerConsole
 * ATMDevice1Code.CustomerConsole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code#DocumentPrinter
 * ATMDevice1Code.DocumentPrinter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMDevice1Code#Journal
 * ATMDevice1Code.Journal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code#JournalPrinter
 * ATMDevice1Code.JournalPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code#ReceiptPrinter
 * ATMDevice1Code.ReceiptPrinter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code#WithdrawalReceipt
 * ATMDevice1Code.WithdrawalReceipt}</li>
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
 * "ATMDevice1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM device to output message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMDevice1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConsole"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code CustomerConsole = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConsole";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.CustomerConsole.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentPrinter"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code DocumentPrinter = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.DocumentPrinter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Journal"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code Journal = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Journal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.Journal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalPrinter"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code JournalPrinter = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.JournalPrinter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPrinter"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code ReceiptPrinter = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinter";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.ReceiptPrinter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReceipt"</li>
	 * </ul>
	 */
	public static final ATMDevice1Code WithdrawalReceipt = new ATMDevice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMDevice1Code.mmObject();
			codeName = ATMDeviceCode.WithdrawalReceipt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMDevice1Code> codesByName = new LinkedHashMap<>();

	protected ATMDevice1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDevice1Code";
				definition = "ATM device to output message.";
				trace_lazy = () -> ATMDeviceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMDevice1Code.CustomerConsole, com.tools20022.repository.codeset.ATMDevice1Code.DocumentPrinter, com.tools20022.repository.codeset.ATMDevice1Code.Journal,
						com.tools20022.repository.codeset.ATMDevice1Code.JournalPrinter, com.tools20022.repository.codeset.ATMDevice1Code.ReceiptPrinter, com.tools20022.repository.codeset.ATMDevice1Code.WithdrawalReceipt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CustomerConsole.getCodeName().get(), CustomerConsole);
		codesByName.put(DocumentPrinter.getCodeName().get(), DocumentPrinter);
		codesByName.put(Journal.getCodeName().get(), Journal);
		codesByName.put(JournalPrinter.getCodeName().get(), JournalPrinter);
		codesByName.put(ReceiptPrinter.getCodeName().get(), ReceiptPrinter);
		codesByName.put(WithdrawalReceipt.getCodeName().get(), WithdrawalReceipt);
	}

	public static ATMDevice1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMDevice1Code[] values() {
		ATMDevice1Code[] values = new ATMDevice1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMDevice1Code> {
		@Override
		public ATMDevice1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMDevice1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}