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
import com.tools20022.repository.codeset.ATMCommand1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of command to be performed by an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand1Code#ATMBalance
 * ATMCommand1Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code#ATMStatusUpdate
 * ATMCommand1Code.ATMStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code#ConfigurationUpdate
 * ATMCommand1Code.ConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code#CountersInquiry
 * ATMCommand1Code.CountersInquiry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand1Code#Disconnect
 * ATMCommand1Code.Disconnect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code#SendMessage
 * ATMCommand1Code.SendMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode ATMCommandCode}</li>
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
 * "ATMCommand1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of command to be performed by an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCommand1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code ATMBalance = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.ATMBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMStatusUpdate"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code ATMStatusUpdate = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMStatusUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.ATMStatusUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfigurationUpdate"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code ConfigurationUpdate = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.ConfigurationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code CountersInquiry = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disconnect"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code Disconnect = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disconnect";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.Disconnect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendMessage"</li>
	 * </ul>
	 */
	public static final ATMCommand1Code SendMessage = new ATMCommand1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand1Code.mmObject();
			codeName = ATMCommandCode.SendMessage.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCommand1Code> codesByName = new LinkedHashMap<>();

	protected ATMCommand1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand1Code";
				definition = "Type of command to be performed by an ATM.";
				trace_lazy = () -> ATMCommandCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCommand1Code.ATMBalance, com.tools20022.repository.codeset.ATMCommand1Code.ATMStatusUpdate,
						com.tools20022.repository.codeset.ATMCommand1Code.ConfigurationUpdate, com.tools20022.repository.codeset.ATMCommand1Code.CountersInquiry, com.tools20022.repository.codeset.ATMCommand1Code.Disconnect,
						com.tools20022.repository.codeset.ATMCommand1Code.SendMessage);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMBalance.getCodeName().get(), ATMBalance);
		codesByName.put(ATMStatusUpdate.getCodeName().get(), ATMStatusUpdate);
		codesByName.put(ConfigurationUpdate.getCodeName().get(), ConfigurationUpdate);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(Disconnect.getCodeName().get(), Disconnect);
		codesByName.put(SendMessage.getCodeName().get(), SendMessage);
	}

	public static ATMCommand1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCommand1Code[] values() {
		ATMCommand1Code[] values = new ATMCommand1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCommand1Code> {
		@Override
		public ATMCommand1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCommand1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}