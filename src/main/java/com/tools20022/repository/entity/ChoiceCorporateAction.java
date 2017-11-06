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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.MandatoryCorporateAction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Mandatory with choice corporate action event that involves a choice on behalf
 * of the owner of the securities. The shareholders are given a chance to choose
 * among several options.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ChoiceCorporateAction"
 * src="doc-files/ChoiceCorporateAction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.MandatoryCorporateAction
 * MandatoryCorporateAction}</li>
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
 * "ChoiceCorporateAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mandatory with choice corporate action event that involves a choice on behalf of the owner of the securities. The shareholders are given a chance to choose among several options."
 * </li>
 * </ul>
 */
public class ChoiceCorporateAction extends MandatoryCorporateAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CorporateActionOption> corporateActionOptionDefinition;
	/**
	 * Definition of the option of a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction
	 * ChoiceCorporateAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails1#mmOptionDetails
	 * InstructedBalanceDetails1.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#mmOptionDetails
	 * InstructedBalanceDetails2.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#mmOptionDetails
	 * InstructedBalanceDetails3.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails4#mmOptionDetails
	 * InstructedBalanceDetails4.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1#mmOptionDetails
	 * CorporateActionDeactivationInstruction1.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmOptionDetails
	 * InstructedBalanceDetails5.mmOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails6#mmOptionDetails
	 * InstructedBalanceDetails6.mmOptionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the option of a corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionOptionDefinition = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedBalanceDetails1.mmOptionDetails, com.tools20022.repository.msg.InstructedBalanceDetails2.mmOptionDetails,
					com.tools20022.repository.msg.InstructedBalanceDetails3.mmOptionDetails, com.tools20022.repository.msg.InstructedBalanceDetails4.mmOptionDetails,
					com.tools20022.repository.msg.CorporateActionDeactivationInstruction1.mmOptionDetails, com.tools20022.repository.msg.InstructedBalanceDetails5.mmOptionDetails,
					com.tools20022.repository.msg.InstructedBalanceDetails6.mmOptionDetails);
			elementContext_lazy = () -> ChoiceCorporateAction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionDefinition";
			definition = "Definition of the option of a corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChoiceCorporateAction";
				definition = "Mandatory with choice corporate action event that involves a choice on behalf of the owner of the securities. The shareholders are given a chance to choose among several options.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction);
				superType_lazy = () -> MandatoryCorporateAction.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChoiceCorporateAction.mmCorporateActionOptionDefinition);
			}
		});
		return mmObject_lazy.get();
	}

	public List<CorporateActionOption> getCorporateActionOptionDefinition() {
		return corporateActionOptionDefinition;
	}

	public void setCorporateActionOptionDefinition(List<com.tools20022.repository.entity.CorporateActionOption> corporateActionOptionDefinition) {
		this.corporateActionOptionDefinition = corporateActionOptionDefinition;
	}
}