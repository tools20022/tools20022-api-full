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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmMatched
 * MatchingStatus7Choice.mmMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmUnmatched
 * MatchingStatus7Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmProprietary
 * MatchingStatus7Choice.mmProprietary}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03#mmInferredMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV03.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03#mmMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV03.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmInferredMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV04.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV04.mmMatchingStatus}</li>
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
 * "MatchingStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the matching status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus19Choice
 * MatchingStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus25Choice
 * MatchingStatus25Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice
 * MatchingStatus2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MatchingStatus7Choice", propOrder = {"matched", "unmatched", "proprietary"})
public class MatchingStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ProprietaryReason1 matched;
	/**
	 * Status is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
	 * MatchingStatus7Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmMatched
	 * MatchingStatus19Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmMatched
	 * MatchingStatus25Choice.mmMatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatched = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> MatchingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Mtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Status is matched.";
			nextVersions_lazy = () -> Arrays.asList(MatchingStatus19Choice.mmMatched, MatchingStatus25Choice.mmMatched);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected UnmatchedStatus5Choice unmatched;
	/**
	 * Status is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus5Choice
	 * UnmatchedStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
	 * MatchingStatus7Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmUnmatched
	 * MatchingStatus19Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmUnmatched
	 * MatchingStatus25Choice.mmUnmatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnmatched = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> MatchingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status is unmatched.";
			nextVersions_lazy = () -> Arrays.asList(MatchingStatus19Choice.mmUnmatched, MatchingStatus25Choice.mmUnmatched);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.UnmatchedStatus5Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason1 proprietary;
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
	 * MatchingStatus7Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmProprietary
	 * MatchingStatus19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmProprietary
	 * MatchingStatus25Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> MatchingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			nextVersions_lazy = () -> Arrays.asList(MatchingStatus19Choice.mmProprietary, MatchingStatus25Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MatchingStatus7Choice.mmMatched, MatchingStatus7Choice.mmUnmatched, MatchingStatus7Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV03.mmInferredMatchingStatus, SecuritiesSettlementTransactionStatusAdviceV03.mmMatchingStatus,
						SecuritiesSettlementTransactionStatusAdviceV04.mmInferredMatchingStatus, SecuritiesSettlementTransactionStatusAdviceV04.mmMatchingStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MatchingStatus7Choice";
				definition = "Choice of format for the matching status.";
				nextVersions_lazy = () -> Arrays.asList(MatchingStatus19Choice.mmObject(), MatchingStatus25Choice.mmObject());
				previousVersion_lazy = () -> MatchingStatus2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Mtchd", required = true)
	public ProprietaryReason1 getMatched() {
		return matched;
	}

	public void setMatched(ProprietaryReason1 matched) {
		this.matched = matched;
	}

	@XmlElement(name = "Umtchd", required = true)
	public UnmatchedStatus5Choice getUnmatched() {
		return unmatched;
	}

	public void setUnmatched(com.tools20022.repository.choice.UnmatchedStatus5Choice unmatched) {
		this.unmatched = unmatched;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason1 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason1 proprietary) {
		this.proprietary = proprietary;
	}
}