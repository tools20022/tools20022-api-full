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
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalAndCurrentQuantities6;
import com.tools20022.repository.msg.SignedQuantityFormat6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different quantity of security formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity18Choice#mmOriginalAndCurrentFaceAmount
 * Quantity18Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity18Choice#mmSignedQuantity
 * Quantity18Choice.mmSignedQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
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
 * "Quantity18Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different quantity of security formats."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Quantity4Choice Quantity4Choice}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Quantity18Choice", propOrder = {"originalAndCurrentFaceAmount", "signedQuantity"})
public class Quantity18Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlAndCurFaceAmt", required = true)
	protected OriginalAndCurrentQuantities6 originalAndCurrentFaceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6
	 * OriginalAndCurrentQuantities6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Quantity18Choice
	 * Quantity18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAndCurFaceAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAndCurrentFaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signed face amount and amortised value of security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity4Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalAndCurrentFaceAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.Quantity18Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAndCurFaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAndCurrentFaceAmount";
			definition = "Signed face amount and amortised value of security.";
			previousVersion_lazy = () -> Quantity4Choice.mmOriginalAndCurrentFaceAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalAndCurrentQuantities6.mmObject();
		}
	};
	@XmlElement(name = "SgndQty", required = true)
	protected SignedQuantityFormat6 signedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Quantity18Choice
	 * Quantity18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signed quantity of security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice#mmSignedQuantity
	 * Quantity4Choice.mmSignedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Quantity18Choice.mmObject();
			isDerived = false;
			xmlTag = "SgndQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedQuantity";
			definition = "Signed quantity of security.";
			previousVersion_lazy = () -> Quantity4Choice.mmSignedQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat6.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Quantity18Choice.mmOriginalAndCurrentFaceAmount, com.tools20022.repository.choice.Quantity18Choice.mmSignedQuantity);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quantity18Choice";
				definition = "Choice between different quantity of security formats.";
				previousVersion_lazy = () -> Quantity4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public OriginalAndCurrentQuantities6 getOriginalAndCurrentFaceAmount() {
		return originalAndCurrentFaceAmount;
	}

	public Quantity18Choice setOriginalAndCurrentFaceAmount(OriginalAndCurrentQuantities6 originalAndCurrentFaceAmount) {
		this.originalAndCurrentFaceAmount = Objects.requireNonNull(originalAndCurrentFaceAmount);
		return this;
	}

	public SignedQuantityFormat6 getSignedQuantity() {
		return signedQuantity;
	}

	public Quantity18Choice setSignedQuantity(SignedQuantityFormat6 signedQuantity) {
		this.signedQuantity = Objects.requireNonNull(signedQuantity);
		return this;
	}
}