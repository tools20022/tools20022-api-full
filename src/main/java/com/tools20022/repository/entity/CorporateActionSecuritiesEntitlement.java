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
import com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice;
import com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice;
import com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice;
import com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice;
import com.tools20022.repository.codeset.RenounceableStatusCode;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.msg.SecuritiesEntitlement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rights for securities entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionSecuritiesEntitlement"
 * src="doc-files/CorporateActionSecuritiesEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#EntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#RenounceableEntitlementStatusType
 * CorporateActionSecuritiesEntitlement.RenounceableEntitlementStatusType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesEntitlement
 * SecuritiesQuantity.SecuritiesEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#SecuritiesDistributionDetails
 * Entitlement1.SecuritiesDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice
 * RenounceableEntitlementStatusTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice
 * RenounceableEntitlementStatusTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesEntitlement1
 * SecuritiesEntitlement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice
 * RenounceableEntitlementStatusTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice
 * RenounceableEntitlementStatusTypeFormat4Choice}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionSecuritiesEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights for securities entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionSecuritiesEntitlement extends CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities based on the terms of the corporate action event
	 * and balance of underlying securities entitled to the account owner. (This
	 * quantity can be positive or negative).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesEntitlement
	 * SecuritiesQuantity.SecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#EntitledQuantity
	 * SecuritiesOption4.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#EntitledQuantity
	 * SecuritiesOption10.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#EntitledQuantity
	 * SecuritiesOption13.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#EntitledQuantity
	 * SecuritiesOption17.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#EntitledQuantity
	 * SecuritiesOption24.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#EntitledQuantity
	 * SecuritiesOption29.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#EntitledQuantity
	 * SecuritiesOption33.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#EntitledQuantity
	 * SecuritiesOption38.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#EntitledQuantity
	 * SecuritiesOption37.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#EntitledQuantity
	 * SecuritiesOption39.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#EntitledQuantity
	 * SecuritiesOption6.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#EntitledQuantity
	 * SecuritiesOption12.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#EntitledQuantity
	 * SecuritiesOption14.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#EntitledQuantity
	 * SecuritiesOption22.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#EntitledQuantity
	 * SecuritiesOption25.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#EntitledQuantity
	 * SecuritiesOption30.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesEntitlement1#EntitledSecuritiesQuantity
	 * SecuritiesEntitlement1.EntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#EntitledQuantity
	 * SecuritiesOption40.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#EntitledQuantity
	 * SecuritiesOption45.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#EntitledQuantity
	 * SecuritiesOption49.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#EntitledQuantity
	 * SecuritiesOption57.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#EntitledQuantity
	 * SecuritiesOption59.EntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#EntitledQuantity
	 * SecuritiesOption61.EntitledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EntitledSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption4.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption10.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption13.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption17.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption24.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption29.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption33.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption38.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption37.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption39.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption6.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption12.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption14.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption22.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption25.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption30.EntitledQuantity, com.tools20022.repository.msg.SecuritiesEntitlement1.EntitledSecuritiesQuantity,
					com.tools20022.repository.msg.SecuritiesOption40.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption45.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption49.EntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption57.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption59.EntitledQuantity, com.tools20022.repository.msg.SecuritiesOption61.EntitledQuantity);
			elementContext_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitledSecuritiesQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether terms of the event allow resale of the rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode
	 * RenounceableStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice#Code
	 * RenounceableEntitlementStatusTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice#Proprietary
	 * RenounceableEntitlementStatusTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes3.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#RenounceableEntitlementStatusType
	 * CorporateAction3.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice#Code
	 * RenounceableEntitlementStatusTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice#Proprietary
	 * RenounceableEntitlementStatusTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes12.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#RenounceableEntitlementStatusType
	 * CorporateAction4.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes17.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#RenounceableEntitlementStatusType
	 * CorporateAction5.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes25.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#RenounceableEntitlementStatusType
	 * CorporateAction6.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#RenounceableEntitlementStatusType
	 * CorporateAction7.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#RenounceableEntitlementStatusType
	 * CorporateAction8.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes46.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#RenounceableEntitlementStatusType
	 * CorporateAction10.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes47.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#RenounceableEntitlementStatusType
	 * CorporateAction11.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#RenounceableEntitlementStatusType
	 * CorporateAction2.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#RenounceableEntitlementStatusType
	 * CorporateAction12.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#RenounceableEntitlementStatusType
	 * CorporateAction17.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#RenounceableEntitlementStatusType
	 * CorporateAction31.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes68.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice#Code
	 * RenounceableEntitlementStatusTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice#Proprietary
	 * RenounceableEntitlementStatusTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#RenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes73.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#RenounceableEntitlementStatusType
	 * CorporateAction40.RenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice#Code
	 * RenounceableEntitlementStatusTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice#Proprietary
	 * RenounceableEntitlementStatusTypeFormat4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RenounceableEntitlementStatusType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice.Code, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes3.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction3.RenounceableEntitlementStatusType,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice.Code, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction4.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction5.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction6.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction7.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction8.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction10.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction11.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction2.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction12.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction17.RenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction31.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.RenounceableEntitlementStatusType, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice.Code,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes73.RenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction40.RenounceableEntitlementStatusType, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice.Code,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RenounceableStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionSecuritiesEntitlement";
				definition = "Rights for securities entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Entitlement1.SecuritiesDistributionDetails);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.RenounceableEntitlementStatusType);
				derivationComponent_lazy = () -> Arrays.asList(RenounceableEntitlementStatusTypeFormat1Choice.mmObject(), RenounceableEntitlementStatusTypeFormat2Choice.mmObject(), SecuritiesEntitlement1.mmObject(),
						RenounceableEntitlementStatusTypeFormat3Choice.mmObject(), RenounceableEntitlementStatusTypeFormat4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}