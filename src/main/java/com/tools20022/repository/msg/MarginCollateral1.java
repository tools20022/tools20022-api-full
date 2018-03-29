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
import com.tools20022.repository.entity.CollateralBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the collateral held, in transit or that still needs to
 * be agreed by both parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmHeldByPartyA
 * MarginCollateral1.mmHeldByPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmHeldByPartyB
 * MarginCollateral1.mmHeldByPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmPriorAgreedToPartyA
 * MarginCollateral1.mmPriorAgreedToPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmPriorAgreedToPartyB
 * MarginCollateral1.mmPriorAgreedToPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmInTransitToPartyA
 * MarginCollateral1.mmInTransitToPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCollateral1#mmInTransitToPartyB
 * MarginCollateral1.mmInTransitToPartyB}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralBalance
 * CollateralBalance}</li>
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
 * "MarginCollateral1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCollateral1", propOrder = {"heldByPartyA", "heldByPartyB", "priorAgreedToPartyA", "priorAgreedToPartyB", "inTransitToPartyA", "inTransitToPartyB"})
public class MarginCollateral1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HeldByPtyA")
	protected ActiveCurrencyAndAmount heldByPartyA;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmHeldAmount
	 * CollateralBalance.mmHeldAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HeldByPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldByPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Post haircut market value of all margin collateral held by party A."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmHeldByPartyA = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmHeldAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "HeldByPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldByPartyA";
			definition = "Post haircut market value of all margin collateral held by party A.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getHeldByPartyA();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setHeldByPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "HeldByPtyB")
	protected ActiveCurrencyAndAmount heldByPartyB;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmHeldAmount
	 * CollateralBalance.mmHeldAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HeldByPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldByPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Post haircut market value of all margin collateral held by party B."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmHeldByPartyB = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmHeldAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "HeldByPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldByPartyB";
			definition = "Post haircut market value of all margin collateral held by party B.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getHeldByPartyB();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setHeldByPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "PrrAgrdToPtyA")
	protected ActiveCurrencyAndAmount priorAgreedToPartyA;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmPriorAgreed
	 * CollateralBalance.mmPriorAgreed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrrAgrdToPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorAgreedToPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all margin agreed amounts due to party A from prior days’ collateral calls where collateral movements have not yet been agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmPriorAgreedToPartyA = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmPriorAgreed;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "PrrAgrdToPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreedToPartyA";
			definition = "Sum of all margin agreed amounts due to party A from prior days’ collateral calls where collateral movements have not yet been agreed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getPriorAgreedToPartyA();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPriorAgreedToPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "PrrAgrdToPtyB")
	protected ActiveCurrencyAndAmount priorAgreedToPartyB;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmPriorAgreed
	 * CollateralBalance.mmPriorAgreed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrrAgrdToPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorAgreedToPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all margin agreed amounts due to party B from prior days’ collateral calls where collateral movements have not yet been agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmPriorAgreedToPartyB = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmPriorAgreed;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "PrrAgrdToPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreedToPartyB";
			definition = "Sum of all margin agreed amounts due to party B from prior days’ collateral calls where collateral movements have not yet been agreed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getPriorAgreedToPartyB();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPriorAgreedToPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnstToPtyA")
	protected ActiveCurrencyAndAmount inTransitToPartyA;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
	 * CollateralBalance.mmInTransit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnstToPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransitToPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all margin collateral movements due to party A in progress but not yet settled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmInTransitToPartyA = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "InTrnstToPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransitToPartyA";
			definition = "Sum of all margin collateral movements due to party A in progress but not yet settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getInTransitToPartyA();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setInTransitToPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnstToPtyB")
	protected ActiveCurrencyAndAmount inTransitToPartyB;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
	 * CollateralBalance.mmInTransit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnstToPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransitToPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all margin collateral movements due to party B in progress but not yet settled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>> mmInTransitToPartyB = new MMMessageAttribute<MarginCollateral1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "InTrnstToPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransitToPartyB";
			definition = "Sum of all margin collateral movements due to party B in progress but not yet settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCollateral1 obj) {
			return obj.getInTransitToPartyB();
		}

		@Override
		public void setValue(MarginCollateral1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setInTransitToPartyB(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCollateral1.mmHeldByPartyA, com.tools20022.repository.msg.MarginCollateral1.mmHeldByPartyB,
						com.tools20022.repository.msg.MarginCollateral1.mmPriorAgreedToPartyA, com.tools20022.repository.msg.MarginCollateral1.mmPriorAgreedToPartyB, com.tools20022.repository.msg.MarginCollateral1.mmInTransitToPartyA,
						com.tools20022.repository.msg.MarginCollateral1.mmInTransitToPartyB);
				trace_lazy = () -> CollateralBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCollateral1";
				definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getHeldByPartyA() {
		return heldByPartyA == null ? Optional.empty() : Optional.of(heldByPartyA);
	}

	public MarginCollateral1 setHeldByPartyA(ActiveCurrencyAndAmount heldByPartyA) {
		this.heldByPartyA = heldByPartyA;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getHeldByPartyB() {
		return heldByPartyB == null ? Optional.empty() : Optional.of(heldByPartyB);
	}

	public MarginCollateral1 setHeldByPartyB(ActiveCurrencyAndAmount heldByPartyB) {
		this.heldByPartyB = heldByPartyB;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPriorAgreedToPartyA() {
		return priorAgreedToPartyA == null ? Optional.empty() : Optional.of(priorAgreedToPartyA);
	}

	public MarginCollateral1 setPriorAgreedToPartyA(ActiveCurrencyAndAmount priorAgreedToPartyA) {
		this.priorAgreedToPartyA = priorAgreedToPartyA;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPriorAgreedToPartyB() {
		return priorAgreedToPartyB == null ? Optional.empty() : Optional.of(priorAgreedToPartyB);
	}

	public MarginCollateral1 setPriorAgreedToPartyB(ActiveCurrencyAndAmount priorAgreedToPartyB) {
		this.priorAgreedToPartyB = priorAgreedToPartyB;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getInTransitToPartyA() {
		return inTransitToPartyA == null ? Optional.empty() : Optional.of(inTransitToPartyA);
	}

	public MarginCollateral1 setInTransitToPartyA(ActiveCurrencyAndAmount inTransitToPartyA) {
		this.inTransitToPartyA = inTransitToPartyA;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getInTransitToPartyB() {
		return inTransitToPartyB == null ? Optional.empty() : Optional.of(inTransitToPartyB);
	}

	public MarginCollateral1 setInTransitToPartyB(ActiveCurrencyAndAmount inTransitToPartyB) {
		this.inTransitToPartyB = inTransitToPartyB;
		return this;
	}
}