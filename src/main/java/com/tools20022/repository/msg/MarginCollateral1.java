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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCollateral1", propOrder = {"heldByPartyA", "heldByPartyB", "priorAgreedToPartyA", "priorAgreedToPartyB", "inTransitToPartyA", "inTransitToPartyB"})
public class MarginCollateral1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount heldByPartyA;
	/**
	 * Post haircut market value of all margin collateral held by party A.
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
	public static final MMMessageAttribute mmHeldByPartyA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmHeldAmount;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "HeldByPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldByPartyA";
			definition = "Post haircut market value of all margin collateral held by party A.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount heldByPartyB;
	/**
	 * Post haircut market value of all margin collateral held by party B.
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
	public static final MMMessageAttribute mmHeldByPartyB = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmHeldAmount;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "HeldByPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldByPartyB";
			definition = "Post haircut market value of all margin collateral held by party B.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount priorAgreedToPartyA;
	/**
	 * Sum of all margin agreed amounts due to party A from prior days’
	 * collateral calls where collateral movements have not yet been agreed.
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
	public static final MMMessageAttribute mmPriorAgreedToPartyA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmPriorAgreed;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "PrrAgrdToPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreedToPartyA";
			definition = "Sum of all margin agreed amounts due to party A from prior days’ collateral calls where collateral movements have not yet been agreed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount priorAgreedToPartyB;
	/**
	 * Sum of all margin agreed amounts due to party B from prior days’
	 * collateral calls where collateral movements have not yet been agreed.
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
	public static final MMMessageAttribute mmPriorAgreedToPartyB = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmPriorAgreed;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "PrrAgrdToPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreedToPartyB";
			definition = "Sum of all margin agreed amounts due to party B from prior days’ collateral calls where collateral movements have not yet been agreed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount inTransitToPartyA;
	/**
	 * Sum of all margin collateral movements due to party A in progress but not
	 * yet settled.
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
	public static final MMMessageAttribute mmInTransitToPartyA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "InTrnstToPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransitToPartyA";
			definition = "Sum of all margin collateral movements due to party A in progress but not yet settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount inTransitToPartyB;
	/**
	 * Sum of all margin collateral movements due to party B in progress but not
	 * yet settled.
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
	public static final MMMessageAttribute mmInTransitToPartyB = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> MarginCollateral1.mmObject();
			isDerived = false;
			xmlTag = "InTrnstToPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransitToPartyB";
			definition = "Sum of all margin collateral movements due to party B in progress but not yet settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginCollateral1.mmHeldByPartyA, MarginCollateral1.mmHeldByPartyB, MarginCollateral1.mmPriorAgreedToPartyA, MarginCollateral1.mmPriorAgreedToPartyB,
						MarginCollateral1.mmInTransitToPartyA, MarginCollateral1.mmInTransitToPartyB);
				trace_lazy = () -> CollateralBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCollateral1";
				definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "HeldByPtyA")
	public ActiveCurrencyAndAmount getHeldByPartyA() {
		return heldByPartyA;
	}

	public void setHeldByPartyA(ActiveCurrencyAndAmount heldByPartyA) {
		this.heldByPartyA = heldByPartyA;
	}

	@XmlElement(name = "HeldByPtyB")
	public ActiveCurrencyAndAmount getHeldByPartyB() {
		return heldByPartyB;
	}

	public void setHeldByPartyB(ActiveCurrencyAndAmount heldByPartyB) {
		this.heldByPartyB = heldByPartyB;
	}

	@XmlElement(name = "PrrAgrdToPtyA")
	public ActiveCurrencyAndAmount getPriorAgreedToPartyA() {
		return priorAgreedToPartyA;
	}

	public void setPriorAgreedToPartyA(ActiveCurrencyAndAmount priorAgreedToPartyA) {
		this.priorAgreedToPartyA = priorAgreedToPartyA;
	}

	@XmlElement(name = "PrrAgrdToPtyB")
	public ActiveCurrencyAndAmount getPriorAgreedToPartyB() {
		return priorAgreedToPartyB;
	}

	public void setPriorAgreedToPartyB(ActiveCurrencyAndAmount priorAgreedToPartyB) {
		this.priorAgreedToPartyB = priorAgreedToPartyB;
	}

	@XmlElement(name = "InTrnstToPtyA")
	public ActiveCurrencyAndAmount getInTransitToPartyA() {
		return inTransitToPartyA;
	}

	public void setInTransitToPartyA(ActiveCurrencyAndAmount inTransitToPartyA) {
		this.inTransitToPartyA = inTransitToPartyA;
	}

	@XmlElement(name = "InTrnstToPtyB")
	public ActiveCurrencyAndAmount getInTransitToPartyB() {
		return inTransitToPartyB;
	}

	public void setInTransitToPartyB(ActiveCurrencyAndAmount inTransitToPartyB) {
		this.inTransitToPartyB = inTransitToPartyB;
	}
}