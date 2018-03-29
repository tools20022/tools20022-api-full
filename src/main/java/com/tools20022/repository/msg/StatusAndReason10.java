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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01;
import com.tools20022.repository.choice.AffirmationStatus7Choice;
import com.tools20022.repository.choice.UnaffirmedReason2Choice;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details related to the status of the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAffirmationStatus
 * StatusAndReason10.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmUnaffirmedReason
 * StatusAndReason10.mmUnaffirmedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAdditionalReasonInformation
 * StatusAndReason10.mmAdditionalReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01#mmStatus
 * SecuritiesTradeConfirmationResponseV01.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forStatusAndReason10
 * ConstraintAdditionalReasonInforrmationRule.forStatusAndReason10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnaffirmedReasonRule#forStatusAndReason10
 * ConstraintUnaffirmedReasonRule.forStatusAndReason10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusAndReason10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details related to the status of the order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusAndReason10", propOrder = {"affirmationStatus", "unaffirmedReason", "additionalReasonInformation"})
public class StatusAndReason10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AffirmSts", required = true)
	protected AffirmationStatus7Choice affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice
	 * AffirmationStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10
	 * StatusAndReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::AFFM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusAndReason10, AffirmationStatus7Choice> mmAffirmationStatus = new MMMessageAttribute<StatusAndReason10, AffirmationStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAndReason10.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::AFFM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AffirmationStatus7Choice.mmObject();
		}

		@Override
		public AffirmationStatus7Choice getValue(StatusAndReason10 obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(StatusAndReason10 obj, AffirmationStatus7Choice value) {
			obj.setAffirmationStatus(value);
		}
	};
	@XmlElement(name = "UaffrmdRsn")
	protected UnaffirmedReason2Choice unaffirmedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice
	 * UnaffirmedReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10
	 * StatusAndReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UaffrmdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnaffirmedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has an unaffirmed status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusAndReason10, Optional<UnaffirmedReason2Choice>> mmUnaffirmedReason = new MMMessageAttribute<StatusAndReason10, Optional<UnaffirmedReason2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAndReason10.mmObject();
			isDerived = false;
			xmlTag = "UaffrmdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffirmedReason";
			definition = "Specifies the reason why the instruction has an unaffirmed status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnaffirmedReason2Choice.mmObject();
		}

		@Override
		public Optional<UnaffirmedReason2Choice> getValue(StatusAndReason10 obj) {
			return obj.getUnaffirmedReason();
		}

		@Override
		public void setValue(StatusAndReason10 obj, Optional<UnaffirmedReason2Choice> value) {
			obj.setUnaffirmedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRsnInf")
	protected Max210Text additionalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10
	 * StatusAndReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the reason in narrative form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusAndReason10, Optional<Max210Text>> mmAdditionalReasonInformation = new MMMessageAttribute<StatusAndReason10, Optional<Max210Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAndReason10.mmObject();
			isDerived = false;
			xmlTag = "AddtlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformation";
			definition = "Provides additional information about the reason in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(StatusAndReason10 obj) {
			return obj.getAdditionalReasonInformation();
		}

		@Override
		public void setValue(StatusAndReason10 obj, Optional<Max210Text> value) {
			obj.setAdditionalReasonInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusAndReason10.mmAffirmationStatus, com.tools20022.repository.msg.StatusAndReason10.mmUnaffirmedReason,
						com.tools20022.repository.msg.StatusAndReason10.mmAdditionalReasonInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationResponseV01.mmStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forStatusAndReason10,
						com.tools20022.repository.constraints.ConstraintUnaffirmedReasonRule.forStatusAndReason10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusAndReason10";
				definition = "Provides details related to the status of the order.";
			}
		});
		return mmObject_lazy.get();
	}

	public AffirmationStatus7Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public StatusAndReason10 setAffirmationStatus(AffirmationStatus7Choice affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public Optional<UnaffirmedReason2Choice> getUnaffirmedReason() {
		return unaffirmedReason == null ? Optional.empty() : Optional.of(unaffirmedReason);
	}

	public StatusAndReason10 setUnaffirmedReason(UnaffirmedReason2Choice unaffirmedReason) {
		this.unaffirmedReason = unaffirmedReason;
		return this;
	}

	public Optional<Max210Text> getAdditionalReasonInformation() {
		return additionalReasonInformation == null ? Optional.empty() : Optional.of(additionalReasonInformation);
	}

	public StatusAndReason10 setAdditionalReasonInformation(Max210Text additionalReasonInformation) {
		this.additionalReasonInformation = additionalReasonInformation;
		return this;
	}
}