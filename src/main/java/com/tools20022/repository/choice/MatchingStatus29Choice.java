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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.msg.ProprietaryReason5;
import com.tools20022.repository.msg.ProprietaryStatusAndReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of format for the matching status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Matched
 * MatchingStatus29Choice.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Unmatched
 * MatchingStatus29Choice.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Proprietary
 * MatchingStatus29Choice.Proprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06#MatchingStatus
 * SecuritiesFinancingStatusAdvice002V06.MatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06#InferredMatchingStatus
 * SecuritiesFinancingStatusAdvice002V06.InferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07#MatchingStatus
 * SecuritiesFinancingStatusAdvice002V07.MatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07#InferredMatchingStatus
 * SecuritiesFinancingStatusAdvice002V07.InferredMatchingStatus}</li>
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
 * "MatchingStatus29Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the matching status."</li>
 * </ul>
 */
public class MatchingStatus29Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason5
	 * ProprietaryReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingStatus
	 * SecuritiesTradeStatus.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice
	 * MatchingStatus29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is matched."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Matched = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MatchingStatus29Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingStatus;
			isDerived = false;
			xmlTag = "Mtchd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Status is matched.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus19Choice
	 * UnmatchedStatus19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
	 * SecuritiesTradeStatus.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice
	 * MatchingStatus29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is unmatched."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Unmatched = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MatchingStatus29Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.Reason;
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status is unmatched.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnmatchedStatus19Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
	 * ProprietaryStatusAndReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice
	 * MatchingStatus29Choice}</li>
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
	 * definition} = "Proprietary status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Proprietary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MatchingStatus29Choice.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryStatusAndReason7.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MatchingStatus29Choice.Matched, com.tools20022.repository.choice.MatchingStatus29Choice.Unmatched,
						com.tools20022.repository.choice.MatchingStatus29Choice.Proprietary);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06.MatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06.InferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07.MatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07.InferredMatchingStatus);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MatchingStatus29Choice";
				definition = "Choice of format for the matching status.";
			}
		});
		return mmObject_lazy.get();
	}
}