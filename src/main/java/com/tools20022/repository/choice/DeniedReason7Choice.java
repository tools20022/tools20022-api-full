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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.DeniedReason6Code;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.msg.GenericIdentification40;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of format for the denied reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason7Choice#Code
 * DeniedReason7Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice#Proprietary
 * DeniedReason7Choice.Proprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "DeniedReason7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the denied reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DeniedReason15Choice
 * DeniedReason15Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice
 * DeniedReason2Choice}</li>
 * </ul>
 */
public class DeniedReason7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason6Code
	 * DeniedReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeniedReason
	 * SecuritiesTradeStatusReason.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice
	 * DeniedReason7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#Code
	 * DeniedReason15Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#Code
	 * DeniedReason2Choice.Code}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeniedReason7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeniedReason;
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the reason why the request was denied.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.DeniedReason2Choice.Code;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DeniedReason15Choice.Code);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeniedReason6Code.mmObject();
		}
	};
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40
	 * GenericIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeniedReason
	 * SecuritiesTradeStatusReason.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice
	 * DeniedReason7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#Proprietary
	 * DeniedReason15Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#Proprietary
	 * DeniedReason2Choice.Proprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DeniedReason7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeniedReason;
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies the reason why the request was denied.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.DeniedReason2Choice.Proprietary;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DeniedReason15Choice.Proprietary);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GenericIdentification40.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DeniedReason7Choice.Code, com.tools20022.repository.choice.DeniedReason7Choice.Proprietary);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeniedReason7Choice";
				definition = "Choice of format for the denied reason.";
				previousVersion_lazy = () -> DeniedReason2Choice.mmObject();
				nextVersions_lazy = () -> Arrays.asList(DeniedReason15Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}