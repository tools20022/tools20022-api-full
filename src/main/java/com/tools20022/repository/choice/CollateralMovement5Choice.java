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
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Collateral17;
import com.tools20022.repository.msg.CollateralMovement11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the collateral movement direction that is a delivery and optionally
 * a return, or a return only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmCollateralMovementDirection
 * CollateralMovement5Choice.mmCollateralMovementDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmReturn
 * CollateralMovement5Choice.mmReturn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
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
 * "CollateralMovement5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the collateral movement direction that is a delivery and optionally a return, or a return only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice
 * CollateralMovement4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralMovement5Choice", propOrder = {"collateralMovementDirection", "return"})
public class CollateralMovement5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralMovement11 collateralMovementDirection;
	/**
	 * Provides the collateral movement direction that is a delivery and
	 * optionally a return.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralMovement11
	 * CollateralMovement11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice
	 * CollateralMovement5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollMvmntDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovementDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral movement direction that is a delivery and optionally a return."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#mmCollateralMovementDirection
	 * CollateralMovement4Choice.mmCollateralMovementDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralMovementDirection = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> CollateralMovement5Choice.mmObject();
			isDerived = false;
			xmlTag = "CollMvmntDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovementDirection";
			definition = "Provides the collateral movement direction that is a delivery and optionally a return.";
			previousVersion_lazy = () -> CollateralMovement4Choice.mmCollateralMovementDirection;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralMovement11.mmObject();
		}
	};
	protected Collateral17 return_;
	/**
	 * Provides the collateral movement direction that is a return only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral17
	 * Collateral17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice
	 * CollateralMovement5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral movement direction that is a return only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#mmReturn
	 * CollateralMovement4Choice.mmReturn}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturn = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> CollateralMovement5Choice.mmObject();
			isDerived = false;
			xmlTag = "Rtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Provides the collateral movement direction that is a return only.";
			previousVersion_lazy = () -> CollateralMovement4Choice.mmReturn;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Collateral17.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralMovement5Choice.mmCollateralMovementDirection, CollateralMovement5Choice.mmReturn);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralMovement5Choice";
				definition = "Provides the collateral movement direction that is a delivery and optionally a return, or a return only.";
				previousVersion_lazy = () -> CollateralMovement4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollMvmntDrctn", required = true)
	public CollateralMovement11 getCollateralMovementDirection() {
		return collateralMovementDirection;
	}

	public void setCollateralMovementDirection(CollateralMovement11 collateralMovementDirection) {
		this.collateralMovementDirection = collateralMovementDirection;
	}

	@XmlElement(name = "Rtr", required = true)
	public Collateral17 getReturn() {
		return return_;
	}

	public void setReturn(Collateral17 return_) {
		this.return_ = return_;
	}
}