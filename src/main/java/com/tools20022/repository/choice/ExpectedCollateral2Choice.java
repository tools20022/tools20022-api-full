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
import com.tools20022.repository.area.colr.MarginCallRequestV04;
import com.tools20022.repository.entity.ExpectedCollateralType;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExpectedCollateral2;
import com.tools20022.repository.msg.ExpectedCollateralMovement2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the expected collateral type and direction for the variation margin
 * and the segregated independent amount, or the segregated independent amount
 * only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#mmExpectedCollateralDetails
 * ExpectedCollateral2Choice.mmExpectedCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#mmSegregatedIndependentAmount
 * ExpectedCollateral2Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
 * ExpectedCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToA
 * MarginCallRequestV04.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToB
 * MarginCallRequestV04.mmExpectedCollateralDueToB}</li>
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
 * "ExpectedCollateral2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the expected collateral type and direction for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice
 * ExpectedCollateral1Choice}</li>
 * </ul>
 */
public class ExpectedCollateral2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ExpectedCollateral2 expectedCollateralDetails;
	/**
	 * Provides the expected collateral type and direction for the variation
	 * margin and optionaly the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExpectedCollateral2
	 * ExpectedCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#mmExpectedCollateralDetails
	 * ExpectedCollateral1Choice.mmExpectedCollateralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpectedCollateralDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> ExpectedCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "XpctdCollDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDetails";
			definition = "Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount.";
			previousVersion_lazy = () -> ExpectedCollateral1Choice.mmExpectedCollateralDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExpectedCollateral2.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#mmSegregatedIndependentAmount
	 * ExpectedCollateral1Choice.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> ExpectedCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the expected collateral type and direction for the segregated independent amount.";
			previousVersion_lazy = () -> ExpectedCollateral1Choice.mmSegregatedIndependentAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExpectedCollateralMovement2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExpectedCollateral2Choice.mmExpectedCollateralDetails, ExpectedCollateral2Choice.mmSegregatedIndependentAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV04.mmExpectedCollateralDueToA, MarginCallRequestV04.mmExpectedCollateralDueToB);
				trace_lazy = () -> ExpectedCollateralType.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpectedCollateral2Choice";
				definition = "Provides the expected collateral type and direction for the variation margin and the segregated independent amount, or the segregated independent amount only.";
				previousVersion_lazy = () -> ExpectedCollateral1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ExpectedCollateral2 getExpectedCollateralDetails() {
		return expectedCollateralDetails;
	}

	public void setExpectedCollateralDetails(ExpectedCollateral2 expectedCollateralDetails) {
		this.expectedCollateralDetails = expectedCollateralDetails;
	}

	public ExpectedCollateralMovement2 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(ExpectedCollateralMovement2 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}