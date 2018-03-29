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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectionReasonV021Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralSubstitution;
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
 * Provides details about the rejected collateral substitution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmCollateralSubstitutionRequestIdentification
 * CollateralSubstitutionResponse2.mmCollateralSubstitutionRequestIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectedAmount
 * CollateralSubstitutionResponse2.mmRejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReason
 * CollateralSubstitutionResponse2.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReasonInformation
 * CollateralSubstitutionResponse2.mmRejectionReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralSubstitution
 * CollateralSubstitution}</li>
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
 * "CollateralSubstitutionResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the rejected collateral substitution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralSubstitutionResponse2", propOrder = {"collateralSubstitutionRequestIdentification", "rejectedAmount", "rejectionReason", "rejectionReasonInformation"})
public class CollateralSubstitutionResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollSbstitnReqId", required = true)
	protected Max35Text collateralSubstitutionRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
	 * CollateralSubstitutionResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the collateral substitution request identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitutionResponse2, Max35Text> mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute<CollateralSubstitutionResponse2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Reference to the collateral substitution request identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralSubstitutionResponse2 obj) {
			return obj.getCollateralSubstitutionRequestIdentification();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse2 obj, Max35Text value) {
			obj.setCollateralSubstitutionRequestIdentification(value);
		}
	};
	@XmlElement(name = "RjctdAmt", required = true)
	protected ActiveCurrencyAndAmount rejectedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmRejectedAmount
	 * CollateralSubstitution.mmRejectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
	 * CollateralSubstitutionResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral substitution amount that is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitutionResponse2, ActiveCurrencyAndAmount> mmRejectedAmount = new MMMessageAttribute<CollateralSubstitutionResponse2, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CollateralSubstitution.mmRejectedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Specifies the collateral substitution amount that is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralSubstitutionResponse2 obj) {
			return obj.getRejectedAmount();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse2 obj, ActiveCurrencyAndAmount value) {
			obj.setRejectedAmount(value);
		}
	};
	@XmlElement(name = "RjctnRsn", required = true)
	protected RejectionReasonV021Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
	 * CollateralSubstitutionResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons why the collateral substitution is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitutionResponse2, RejectionReasonV021Code> mmRejectionReason = new MMMessageAttribute<CollateralSubstitutionResponse2, RejectionReasonV021Code>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reasons why the collateral substitution is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV021Code.mmObject();
		}

		@Override
		public RejectionReasonV021Code getValue(CollateralSubstitutionResponse2 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse2 obj, RejectionReasonV021Code value) {
			obj.setRejectionReason(value);
		}
	};
	@XmlElement(name = "RjctnRsnInf")
	protected Max140Text rejectionReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
	 * CollateralSubstitutionResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the collateral substitution request rejection."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitutionResponse2, Optional<Max140Text>> mmRejectionReasonInformation = new MMMessageAttribute<CollateralSubstitutionResponse2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReasonInformation";
			definition = "Provides additional information about the collateral substitution request rejection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CollateralSubstitutionResponse2 obj) {
			return obj.getRejectionReasonInformation();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse2 obj, Optional<Max140Text> value) {
			obj.setRejectionReasonInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmCollateralSubstitutionRequestIdentification,
						com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmRejectedAmount, com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmRejectionReason,
						com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmRejectionReasonInformation);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionResponse2";
				definition = "Provides details about the rejected collateral substitution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public CollateralSubstitutionResponse2 setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = Objects.requireNonNull(collateralSubstitutionRequestIdentification);
		return this;
	}

	public ActiveCurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public CollateralSubstitutionResponse2 setRejectedAmount(ActiveCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = Objects.requireNonNull(rejectedAmount);
		return this;
	}

	public RejectionReasonV021Code getRejectionReason() {
		return rejectionReason;
	}

	public CollateralSubstitutionResponse2 setRejectionReason(RejectionReasonV021Code rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public Optional<Max140Text> getRejectionReasonInformation() {
		return rejectionReasonInformation == null ? Optional.empty() : Optional.of(rejectionReasonInformation);
	}

	public CollateralSubstitutionResponse2 setRejectionReasonInformation(Max140Text rejectionReasonInformation) {
		this.rejectionReasonInformation = rejectionReasonInformation;
		return this;
	}
}