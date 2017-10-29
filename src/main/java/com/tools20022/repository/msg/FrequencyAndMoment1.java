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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.Exact2NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines a frequency in terms a specific moment within a specified period
 * type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FrequencyAndMoment1#Type
 * FrequencyAndMoment1.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrequencyAndMoment1#PointInTime
 * FrequencyAndMoment1.PointInTime}</li>
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
 * "FrequencyAndMoment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines a frequency in terms a specific moment within a specified period type."
 * </li>
 * </ul>
 */
public class FrequencyAndMoment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period for which the number of instructions are to be created and
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency6Code
	 * Frequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrequencyAndMoment1
	 * FrequencyAndMoment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period for which the number of instructions are to be created and processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyAndMoment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Period for which the number of instructions are to be created and processed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}
	};
	/**
	 * Further information on the exact point in time the event should take
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact2NumericText
	 * Exact2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrequencyAndMoment1
	 * FrequencyAndMoment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtInTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointInTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information on the exact point in time the event should take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PointInTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyAndMoment1.mmObject();
			isDerived = false;
			xmlTag = "PtInTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointInTime";
			definition = "Further information on the exact point in time the event should take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FrequencyAndMoment1.Type, com.tools20022.repository.msg.FrequencyAndMoment1.PointInTime);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FrequencyAndMoment1";
				definition = "Defines a frequency in terms a specific moment within a specified period type.";
			}
		});
		return mmObject_lazy.get();
	}
}