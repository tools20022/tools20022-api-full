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
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmSecuritiesDistributionDetails
 * Entitlement1.mmSecuritiesDistributionDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected SecuritiesQuantity entitledSecuritiesQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
	 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmEntitledQuantity
	 * SecuritiesOption4.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmEntitledQuantity
	 * SecuritiesOption10.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmEntitledQuantity
	 * SecuritiesOption13.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmEntitledQuantity
	 * SecuritiesOption17.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmEntitledQuantity
	 * SecuritiesOption24.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmEntitledQuantity
	 * SecuritiesOption29.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmEntitledQuantity
	 * SecuritiesOption33.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmEntitledQuantity
	 * SecuritiesOption38.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmEntitledQuantity
	 * SecuritiesOption37.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmEntitledQuantity
	 * SecuritiesOption39.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmEntitledQuantity
	 * SecuritiesOption6.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmEntitledQuantity
	 * SecuritiesOption12.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmEntitledQuantity
	 * SecuritiesOption14.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmEntitledQuantity
	 * SecuritiesOption22.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmEntitledQuantity
	 * SecuritiesOption25.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmEntitledQuantity
	 * SecuritiesOption30.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesEntitlement1#mmEntitledSecuritiesQuantity
	 * SecuritiesEntitlement1.mmEntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmEntitledQuantity
	 * SecuritiesOption40.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmEntitledQuantity
	 * SecuritiesOption45.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmEntitledQuantity
	 * SecuritiesOption49.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmEntitledQuantity
	 * SecuritiesOption57.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmEntitledQuantity
	 * SecuritiesOption59.mmEntitledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmEntitledQuantity
	 * SecuritiesOption61.mmEntitledQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmEntitledSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption4.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption10.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption13.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption17.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption24.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption29.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption33.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption38.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption37.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption39.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption6.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption12.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption14.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption22.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption25.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption30.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesEntitlement1.mmEntitledSecuritiesQuantity, com.tools20022.repository.msg.SecuritiesOption40.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption45.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption49.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption57.mmEntitledQuantity,
					com.tools20022.repository.msg.SecuritiesOption59.mmEntitledQuantity, com.tools20022.repository.msg.SecuritiesOption61.mmEntitledQuantity);
			elementContext_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitledSecuritiesQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected RenounceableStatusCode renounceableEntitlementStatusType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice#mmCode
	 * RenounceableEntitlementStatusTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice#mmProprietary
	 * RenounceableEntitlementStatusTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes3.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmRenounceableEntitlementStatusType
	 * CorporateAction3.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice#mmCode
	 * RenounceableEntitlementStatusTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice#mmProprietary
	 * RenounceableEntitlementStatusTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes12.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmRenounceableEntitlementStatusType
	 * CorporateAction4.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes17.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRenounceableEntitlementStatusType
	 * CorporateAction5.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes25.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmRenounceableEntitlementStatusType
	 * CorporateAction6.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmRenounceableEntitlementStatusType
	 * CorporateAction7.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmRenounceableEntitlementStatusType
	 * CorporateAction8.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes46.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRenounceableEntitlementStatusType
	 * CorporateAction10.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes47.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmRenounceableEntitlementStatusType
	 * CorporateAction11.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRenounceableEntitlementStatusType
	 * CorporateAction2.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRenounceableEntitlementStatusType
	 * CorporateAction12.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmRenounceableEntitlementStatusType
	 * CorporateAction17.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmRenounceableEntitlementStatusType
	 * CorporateAction31.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes68.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice#mmCode
	 * RenounceableEntitlementStatusTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice#mmProprietary
	 * RenounceableEntitlementStatusTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmRenounceableEntitlementStatusType
	 * FinancialInstrumentAttributes73.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmRenounceableEntitlementStatusType
	 * CorporateAction40.mmRenounceableEntitlementStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice#mmCode
	 * RenounceableEntitlementStatusTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice#mmProprietary
	 * RenounceableEntitlementStatusTypeFormat4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRenounceableEntitlementStatusType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice.mmCode, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes3.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction3.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice.mmCode, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat2Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction4.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction5.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction6.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction7.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction8.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction10.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction11.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction2.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction12.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction17.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction31.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.mmRenounceableEntitlementStatusType, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice.mmCode,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes73.mmRenounceableEntitlementStatusType,
					com.tools20022.repository.msg.CorporateAction40.mmRenounceableEntitlementStatusType, com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice.mmCode,
					com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RenounceableStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionSecuritiesEntitlement";
				definition = "Rights for securities entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Entitlement1.mmSecuritiesDistributionDetails);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType);
				derivationComponent_lazy = () -> Arrays.asList(RenounceableEntitlementStatusTypeFormat1Choice.mmObject(), RenounceableEntitlementStatusTypeFormat2Choice.mmObject(), SecuritiesEntitlement1.mmObject(),
						RenounceableEntitlementStatusTypeFormat3Choice.mmObject(), RenounceableEntitlementStatusTypeFormat4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getEntitledSecuritiesQuantity() {
		return entitledSecuritiesQuantity;
	}

	public void setEntitledSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity entitledSecuritiesQuantity) {
		this.entitledSecuritiesQuantity = entitledSecuritiesQuantity;
	}

	public RenounceableStatusCode getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType;
	}

	public void setRenounceableEntitlementStatusType(RenounceableStatusCode renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
	}
}