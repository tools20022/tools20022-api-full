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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ExpectedCollateralType;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the expected collateral type and direction for the variation margin
 * and optionaly the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#mmVariationMargin
 * ExpectedCollateral2.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#mmSegregatedIndependentAmount
 * ExpectedCollateral2.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
 * ExpectedCollateralType}</li>
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
 * "ExpectedCollateral2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1
 * ExpectedCollateral1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ExpectedCollateral2", propOrder = {"variationMargin", "segregatedIndependentAmount"})
public class ExpectedCollateral2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ExpectedCollateralMovement2 variationMargin;
	/**
	 * Provides the expected collateral type and direction for the variation
	 * margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
	 * ExpectedCollateralMovement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2
	 * ExpectedCollateral2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the expected collateral type and direction for the variation margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#mmVariationMargin
	 * ExpectedCollateral1.mmVariationMargin}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariationMargin = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> ExpectedCollateral2.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the expected collateral type and direction for the variation margin.";
			previousVersion_lazy = () -> ExpectedCollateral1.mmVariationMargin;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedCollateralMovement2.mmObject();
		}
	};
	protected ExpectedCollateralMovement2 segregatedIndependentAmount;
	/**
	 * Provides the expected collateral type and direction for the segregated
	 * independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
	 * ExpectedCollateralMovement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2
	 * ExpectedCollateral2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the expected collateral type and direction for the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#mmSegregatedIndependentAmount
	 * ExpectedCollateral1.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> ExpectedCollateral2.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the expected collateral type and direction for the segregated independent amount.";
			previousVersion_lazy = () -> ExpectedCollateral1.mmSegregatedIndependentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedCollateralMovement2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExpectedCollateral2.mmVariationMargin, ExpectedCollateral2.mmSegregatedIndependentAmount);
				trace_lazy = () -> ExpectedCollateralType.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpectedCollateral2";
				definition = "Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount.";
				previousVersion_lazy = () -> ExpectedCollateral1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "VartnMrgn", required = true)
	public ExpectedCollateralMovement2 getVariationMargin() {
		return variationMargin;
	}

	public void setVariationMargin(com.tools20022.repository.msg.ExpectedCollateralMovement2 variationMargin) {
		this.variationMargin = variationMargin;
	}

	@XmlElement(name = "SgrtdIndpdntAmt")
	public ExpectedCollateralMovement2 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(com.tools20022.repository.msg.ExpectedCollateralMovement2 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}