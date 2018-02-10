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
import com.tools20022.repository.codeset.MessageItemCondition1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Rule to apply for the presence of a message item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#Mandatory
 * MessageItemCondition1Code.Mandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#ConfiguredValue
 * MessageItemCondition1Code.ConfiguredValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#DefaultValue
 * MessageItemCondition1Code.DefaultValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#AllowedValues
 * MessageItemCondition1Code.AllowedValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#IfAvailable
 * MessageItemCondition1Code.IfAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#Copy
 * MessageItemCondition1Code.Copy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code#NotSupported
 * MessageItemCondition1Code.NotSupported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
 * MessageItemConditionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MNDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageItemCondition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rule to apply for the presence of a message item."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageItemCondition1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code Mandatory = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandatory";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.Mandatory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfiguredValue"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code ConfiguredValue = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfiguredValue";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.ConfiguredValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultValue"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code DefaultValue = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultValue";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.DefaultValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedValues"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code AllowedValues = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedValues";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.AllowedValues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IfAvailable"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code IfAvailable = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IfAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.IfAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code Copy = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Copy";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.Copy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * </ul>
	 */
	public static final MessageItemCondition1Code NotSupported = new MessageItemCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemCondition1Code.mmObject();
			codeName = MessageItemConditionCode.NotSupported.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageItemCondition1Code> codesByName = new LinkedHashMap<>();

	protected MessageItemCondition1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MNDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageItemCondition1Code";
				definition = "Rule to apply for the presence of a message item.";
				trace_lazy = () -> MessageItemConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageItemCondition1Code.Mandatory, com.tools20022.repository.codeset.MessageItemCondition1Code.ConfiguredValue,
						com.tools20022.repository.codeset.MessageItemCondition1Code.DefaultValue, com.tools20022.repository.codeset.MessageItemCondition1Code.AllowedValues,
						com.tools20022.repository.codeset.MessageItemCondition1Code.IfAvailable, com.tools20022.repository.codeset.MessageItemCondition1Code.Copy, com.tools20022.repository.codeset.MessageItemCondition1Code.NotSupported);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
		codesByName.put(ConfiguredValue.getCodeName().get(), ConfiguredValue);
		codesByName.put(DefaultValue.getCodeName().get(), DefaultValue);
		codesByName.put(AllowedValues.getCodeName().get(), AllowedValues);
		codesByName.put(IfAvailable.getCodeName().get(), IfAvailable);
		codesByName.put(Copy.getCodeName().get(), Copy);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
	}

	public static MessageItemCondition1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageItemCondition1Code[] values() {
		MessageItemCondition1Code[] values = new MessageItemCondition1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageItemCondition1Code> {
		@Override
		public MessageItemCondition1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageItemCondition1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}