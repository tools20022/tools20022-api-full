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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralSubstitutionResponse2", propOrder = {"collateralSubstitutionRequestIdentification", "rejectedAmount", "rejectionReason", "rejectionReasonInformation"})
public class CollateralSubstitutionResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text collateralSubstitutionRequestIdentification;
	/**
	 * Reference to the collateral substitution request identification.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Reference to the collateral substitution request identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount rejectedAmount;
	/**
	 * Specifies the collateral substitution amount that is rejected.
	 * <p>
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
	public static final MMMessageAttribute mmRejectedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralSubstitution.mmRejectedAmount;
			componentContext_lazy = () -> CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Specifies the collateral substitution amount that is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RejectionReasonV021Code rejectionReason;
	/**
	 * Specifies the reasons why the collateral substitution is rejected.
	 * <p>
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
	public static final MMMessageAttribute mmRejectionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reasons why the collateral substitution is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV021Code.mmObject();
		}
	};
	protected Max140Text rejectionReasonInformation;
	/**
	 * Provides additional information about the collateral substitution request
	 * rejection.
	 * <p>
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
	public static final MMMessageAttribute mmRejectionReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> CollateralSubstitutionResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReasonInformation";
			definition = "Provides additional information about the collateral substitution request rejection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralSubstitutionResponse2.mmCollateralSubstitutionRequestIdentification, CollateralSubstitutionResponse2.mmRejectedAmount, CollateralSubstitutionResponse2.mmRejectionReason,
						CollateralSubstitutionResponse2.mmRejectionReasonInformation);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionResponse2";
				definition = "Provides details about the rejected collateral substitution.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollSbstitnReqId", required = true)
	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public void setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = collateralSubstitutionRequestIdentification;
	}

	@XmlElement(name = "RjctdAmt", required = true)
	public ActiveCurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public void setRejectedAmount(ActiveCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = rejectedAmount;
	}

	@XmlElement(name = "RjctnRsn", required = true)
	public RejectionReasonV021Code getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(RejectionReasonV021Code rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlElement(name = "RjctnRsnInf")
	public Max140Text getRejectionReasonInformation() {
		return rejectionReasonInformation;
	}

	public void setRejectionReasonInformation(Max140Text rejectionReasonInformation) {
		this.rejectionReasonInformation = rejectionReasonInformation;
	}
}