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
 * Rule to apply for the presence and the value of a message item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmMandatory
 * MessageItemConditionCode.mmMandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmConfiguredValue
 * MessageItemConditionCode.mmConfiguredValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmDefaultValue
 * MessageItemConditionCode.mmDefaultValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmAllowedValues
 * MessageItemConditionCode.mmAllowedValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmIfAvailable
 * MessageItemConditionCode.mmIfAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmCopy
 * MessageItemConditionCode.mmCopy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#mmNotSupported
 * MessageItemConditionCode.mmNotSupported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
 * MessageItemCondition1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "MessageItemConditionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rule to apply for the presence and the value of a message item."</li>
 * </ul>
 */
public class MessageItemConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message item must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must be present."</li>
	 * </ul>
	 */
	public static final MMCode mmMandatory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Message item must be present.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "MNDT";
		}
	};
	/**
	 * Message item must be present with the configured value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfiguredValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must be present with the configured value."</li>
	 * </ul>
	 */
	public static final MMCode mmConfiguredValue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfiguredValue";
			definition = "Message item must be present with the configured value.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "CFVL";
		}
	};
	/**
	 * Message item has the configured value if the item is absent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message item has the configured value if the item is absent."</li>
	 * </ul>
	 */
	public static final MMCode mmDefaultValue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultValue";
			definition = "Message item has the configured value if the item is absent.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Message item must have one of the configured values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALWV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedValues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must have one of the configured values."</li>
	 * </ul>
	 */
	public static final MMCode mmAllowedValues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowedValues";
			definition = "Message item must have one of the configured values.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "ALWV";
		}
	};
	/**
	 * Message item has to be present if available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IfAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item has to be present if available."</li>
	 * </ul>
	 */
	public static final MMCode mmIfAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IfAvailable";
			definition = "Message item has to be present if available.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "IFAV";
		}
	};
	/**
	 * Message item is present if it was present in a previous related message
	 * with the same value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message item is present if it was present in a previous related message with the same value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCopy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Copy";
			definition = "Message item is present if it was present in a previous related message with the same value.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "COPY";
		}
	};
	/**
	 * Message item is not supported and has to be absent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item is not supported and has to be absent."</li>
	 * </ul>
	 */
	public static final MMCode mmNotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotSupported";
			definition = "Message item is not supported and has to be absent.";
			owner_lazy = () -> MessageItemConditionCode.mmObject();
			codeName = "UNSP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("MNDT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MessageItemConditionCode";
				definition = "Rule to apply for the presence and the value of a message item.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageItemConditionCode.mmMandatory, com.tools20022.repository.codeset.MessageItemConditionCode.mmConfiguredValue,
						com.tools20022.repository.codeset.MessageItemConditionCode.mmDefaultValue, com.tools20022.repository.codeset.MessageItemConditionCode.mmAllowedValues,
						com.tools20022.repository.codeset.MessageItemConditionCode.mmIfAvailable, com.tools20022.repository.codeset.MessageItemConditionCode.mmCopy, com.tools20022.repository.codeset.MessageItemConditionCode.mmNotSupported);
				derivation_lazy = () -> Arrays.asList(MessageItemCondition1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}