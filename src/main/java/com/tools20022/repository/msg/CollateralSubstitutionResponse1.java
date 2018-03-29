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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralSubstitution;
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
 * Provides details about the accepted collateral substitution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1#mmCollateralSubstitutionRequestIdentification
 * CollateralSubstitutionResponse1.mmCollateralSubstitutionRequestIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1#mmAcceptedAmount
 * CollateralSubstitutionResponse1.mmAcceptedAmount}</li>
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
 * "CollateralSubstitutionResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the accepted collateral substitution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralSubstitutionResponse1", propOrder = {"collateralSubstitutionRequestIdentification", "acceptedAmount"})
public class CollateralSubstitutionResponse1 {

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
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1
	 * CollateralSubstitutionResponse1}</li>
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
	public static final MMMessageAttribute<CollateralSubstitutionResponse1, Max35Text> mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute<CollateralSubstitutionResponse1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse1.mmObject();
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
		public Max35Text getValue(CollateralSubstitutionResponse1 obj) {
			return obj.getCollateralSubstitutionRequestIdentification();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse1 obj, Max35Text value) {
			obj.setCollateralSubstitutionRequestIdentification(value);
		}
	};
	@XmlElement(name = "AccptdAmt")
	protected ActiveCurrencyAndAmount acceptedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmAcceptedAmount
	 * CollateralSubstitution.mmAcceptedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1
	 * CollateralSubstitutionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the accepted collateral substitution amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitutionResponse1, Optional<ActiveCurrencyAndAmount>> mmAcceptedAmount = new MMMessageAttribute<CollateralSubstitutionResponse1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralSubstitution.mmAcceptedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitutionResponse1.mmObject();
			isDerived = false;
			xmlTag = "AccptdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Provides the accepted collateral substitution amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CollateralSubstitutionResponse1 obj) {
			return obj.getAcceptedAmount();
		}

		@Override
		public void setValue(CollateralSubstitutionResponse1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAcceptedAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitutionResponse1.mmCollateralSubstitutionRequestIdentification,
						com.tools20022.repository.msg.CollateralSubstitutionResponse1.mmAcceptedAmount);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionResponse1";
				definition = "Provides details about the accepted collateral substitution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public CollateralSubstitutionResponse1 setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = Objects.requireNonNull(collateralSubstitutionRequestIdentification);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAcceptedAmount() {
		return acceptedAmount == null ? Optional.empty() : Optional.of(acceptedAmount);
	}

	public CollateralSubstitutionResponse1 setAcceptedAmount(ActiveCurrencyAndAmount acceptedAmount) {
		this.acceptedAmount = acceptedAmount;
		return this;
	}
}