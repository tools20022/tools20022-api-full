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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.DisputeNotification1Choice;
import com.tools20022.repository.choice.DisputeResolutionType1Choice;
import com.tools20022.repository.choice.DisputeResolutionType2Choice;
import com.tools20022.repository.codeset.DisputeResolutionTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.msg.Dispute1;
import com.tools20022.repository.msg.DisputeNotification1;
import com.tools20022.repository.msg.SegregatedIndependentAmountDispute1;
import com.tools20022.repository.msg.VariationMarginDispute1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the dispute details on the variation margin and/or the segregated
 * independent amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DisputeManagement" src="doc-files/DisputeManagement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#DisputedAmount
 * DisputeManagement.DisputedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#DisputeDate
 * DisputeManagement.DisputeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#DisputeResolutionType
 * DisputeManagement.DisputeResolutionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#RelatedManagementProcess
 * DisputeManagement.RelatedManagementProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#DisputeManagement
 * CollateralManagement.DisputeManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMarginDispute1#DisputeDetails
 * VariationMarginDispute1.DisputeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice#DisputeNotificationDetails
 * DisputeNotification1Choice.DisputeNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Dispute1 Dispute1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType2Choice
 * DisputeResolutionType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VariationMarginDispute1
 * VariationMarginDispute1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType1Choice
 * DisputeResolutionType1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1
 * SegregatedIndependentAmountDispute1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisputeNotification1
 * DisputeNotification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DisputeNotification1Choice
 * DisputeNotification1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeManagement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the dispute details on the variation margin and/or the segregated independent amount."
 * </li>
 * </ul>
 */
public class DisputeManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Disputed amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Dispute1#DisputedAmount
	 * Dispute1.DisputedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disputed amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DisputedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Dispute1.DisputedAmount);
			elementContext_lazy = () -> DisputeManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedAmount";
			definition = "Disputed amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date of dispute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Dispute1#DisputeDate
	 * Dispute1.DisputeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of dispute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DisputeDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Dispute1.DisputeDate);
			elementContext_lazy = () -> DisputeManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeDate";
			definition = "Date of dispute.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the type of dispute that is to be resolved regarding the
	 * disputed collateral amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType2Choice#Code
	 * DisputeResolutionType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType2Choice#ProprietaryIdentification
	 * DisputeResolutionType2Choice.ProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMarginDispute1#ResolutionTypeDetails
	 * VariationMarginDispute1.ResolutionTypeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType1Choice#Code
	 * DisputeResolutionType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeResolutionType1Choice#ProprietaryIdentification
	 * DisputeResolutionType1Choice.ProprietaryIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeResolutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DisputeResolutionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DisputeResolutionType2Choice.Code, com.tools20022.repository.choice.DisputeResolutionType2Choice.ProprietaryIdentification,
					com.tools20022.repository.msg.VariationMarginDispute1.ResolutionTypeDetails, com.tools20022.repository.choice.DisputeResolutionType1Choice.Code,
					com.tools20022.repository.choice.DisputeResolutionType1Choice.ProprietaryIdentification);
			elementContext_lazy = () -> DisputeManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeResolutionType";
			definition = "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DisputeResolutionTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#DisputeManagement
	 * CollateralManagement.DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DisputeManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.DisputeManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisputeManagement";
				definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.DisputeManagement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMarginDispute1.DisputeDetails, com.tools20022.repository.choice.DisputeNotification1Choice.DisputeNotificationDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisputeManagement.DisputedAmount, com.tools20022.repository.entity.DisputeManagement.DisputeDate,
						com.tools20022.repository.entity.DisputeManagement.DisputeResolutionType, com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess);
				derivationComponent_lazy = () -> Arrays.asList(Dispute1.mmObject(), DisputeResolutionType2Choice.mmObject(), VariationMarginDispute1.mmObject(), DisputeResolutionType1Choice.mmObject(),
						SegregatedIndependentAmountDispute1.mmObject(), DisputeNotification1.mmObject(), DisputeNotification1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}