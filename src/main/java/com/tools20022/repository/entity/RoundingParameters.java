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
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.msg.RoundingParameters1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters applied to a fractional number.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RoundingParameters" src="doc-files/RoundingParameters.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#InvestmentAccountService
 * RoundingParameters.InvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#RoundingModulus
 * RoundingParameters.RoundingModulus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#RoundingDirection
 * RoundingParameters.RoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#RelatedPegOrderInstruction
 * RoundingParameters.RelatedPegOrderInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#RoundingMethod
 * InvestmentAccountService.RoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#RoundDirection
 * SecuritiesPegOrderInstruction.RoundDirection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RoundingParameters1
 * RoundingParameters1}</li>
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
 * "RoundingParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to a fractional number."</li>
 * </ul>
 */
public class RoundingParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment account services for which rounding parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#RoundingMethod
	 * InvestmentAccountService.RoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services for which rounding parameters are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountService";
			definition = "Investment account services for which rounding parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Float value specifying the value to which rounding is required, eg, 10
	 * means round to a multiple of 10 units/shares, 0.5 means round to a
	 * multiple of 0.5 units/shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RoundingParameters1#RoundingModulus
	 * RoundingParameters1.RoundingModulus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingModulus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RoundingModulus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RoundingParameters1.RoundingModulus);
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingModulus";
			definition = "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Rounding direction applied to fractional numbers, eg, round up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RoundingParameters1#RoundingDirection
	 * RoundingParameters1.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#RoundingDirection
	 * InvestmentPlan4.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#RoundingDirection
	 * InvestmentPlan6.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#RoundingDirection
	 * InvestmentPlan5.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#RoundingDirection
	 * InvestmentPlan7.RoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#Rounding
	 * Transfer10.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#Rounding
	 * Transfer14.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#Rounding
	 * Transfer24.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#Rounding
	 * Transfer9.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#Rounding
	 * Transfer12.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#Rounding
	 * Transfer20.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#Rounding
	 * Transfer13.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#Rounding
	 * Transfer23.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#Rounding
	 * Transfer8.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#Rounding
	 * Transfer11.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#Rounding
	 * Transfer19.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder3#Rounding
	 * RedemptionOrder3.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder5#Rounding
	 * RedemptionOrder5.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#Rounding
	 * RedemptionExecution3.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#Rounding
	 * RedemptionExecution5.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder7#Rounding
	 * RedemptionOrder7.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder4#Rounding
	 * RedemptionOrder4.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder6#Rounding
	 * RedemptionOrder6.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#Rounding
	 * RedemptionExecution4.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#Rounding
	 * RedemptionExecution6.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder8#Rounding
	 * RedemptionOrder8.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#Rounding
	 * SubscriptionOrder3.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#Rounding
	 * SubscriptionOrder5.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#Rounding
	 * SubscriptionExecution3.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#Rounding
	 * SubscriptionExecution5.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#Rounding
	 * SubscriptionOrder7.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#Rounding
	 * SubscriptionOrder4.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#Rounding
	 * SubscriptionOrder6.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#Rounding
	 * SubscriptionExecution4.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#Rounding
	 * SubscriptionExecution6.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#Rounding
	 * SubscriptionOrder8.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#RoundingDirection
	 * InvestmentPlan9.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#RoundingDirection
	 * InvestmentPlan8.RoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#Rounding
	 * Transfer27.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#Rounding
	 * Transfer28.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#RoundingDirection
	 * InvestmentPlan10.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#RoundingDirection
	 * InvestmentPlan11.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#RoundingDirection
	 * InvestmentPlan12.RoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#Rounding
	 * Transfer31.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#Rounding
	 * Transfer30.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#RoundingDirection
	 * InvestmentPlan13.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#RoundingDirection
	 * InvestmentPlan14.RoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder14#Rounding
	 * RedemptionOrder14.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#RoundingDirection
	 * InvestmentPlan15.RoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#Rounding
	 * SubscriptionExecution13.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#Rounding
	 * SubscriptionExecution12.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#Rounding
	 * SubscriptionOrder15.Rounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder15#Rounding
	 * RedemptionOrder15.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#Rounding
	 * RedemptionExecution16.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#Rounding
	 * SubscriptionOrder14.Rounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#Rounding
	 * RedemptionExecution15.Rounding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding direction applied to fractional numbers, eg, round up."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RoundingDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RoundingParameters1.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan4.RoundingDirection,
					com.tools20022.repository.msg.InvestmentPlan6.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan5.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan7.RoundingDirection,
					com.tools20022.repository.msg.Transfer10.Rounding, com.tools20022.repository.msg.Transfer14.Rounding, com.tools20022.repository.msg.Transfer24.Rounding, com.tools20022.repository.msg.Transfer9.Rounding,
					com.tools20022.repository.msg.Transfer12.Rounding, com.tools20022.repository.msg.Transfer20.Rounding, com.tools20022.repository.msg.Transfer13.Rounding, com.tools20022.repository.msg.Transfer23.Rounding,
					com.tools20022.repository.msg.Transfer8.Rounding, com.tools20022.repository.msg.Transfer11.Rounding, com.tools20022.repository.msg.Transfer19.Rounding, com.tools20022.repository.msg.RedemptionOrder3.Rounding,
					com.tools20022.repository.msg.RedemptionOrder5.Rounding, com.tools20022.repository.msg.RedemptionExecution3.Rounding, com.tools20022.repository.msg.RedemptionExecution5.Rounding,
					com.tools20022.repository.msg.RedemptionOrder7.Rounding, com.tools20022.repository.msg.RedemptionOrder4.Rounding, com.tools20022.repository.msg.RedemptionOrder6.Rounding,
					com.tools20022.repository.msg.RedemptionExecution4.Rounding, com.tools20022.repository.msg.RedemptionExecution6.Rounding, com.tools20022.repository.msg.RedemptionOrder8.Rounding,
					com.tools20022.repository.msg.SubscriptionOrder3.Rounding, com.tools20022.repository.msg.SubscriptionOrder5.Rounding, com.tools20022.repository.msg.SubscriptionExecution3.Rounding,
					com.tools20022.repository.msg.SubscriptionExecution5.Rounding, com.tools20022.repository.msg.SubscriptionOrder7.Rounding, com.tools20022.repository.msg.SubscriptionOrder4.Rounding,
					com.tools20022.repository.msg.SubscriptionOrder6.Rounding, com.tools20022.repository.msg.SubscriptionExecution4.Rounding, com.tools20022.repository.msg.SubscriptionExecution6.Rounding,
					com.tools20022.repository.msg.SubscriptionOrder8.Rounding, com.tools20022.repository.msg.InvestmentPlan9.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan8.RoundingDirection,
					com.tools20022.repository.msg.Transfer27.Rounding, com.tools20022.repository.msg.Transfer28.Rounding, com.tools20022.repository.msg.InvestmentPlan10.RoundingDirection,
					com.tools20022.repository.msg.InvestmentPlan11.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan12.RoundingDirection, com.tools20022.repository.msg.Transfer31.Rounding,
					com.tools20022.repository.msg.Transfer30.Rounding, com.tools20022.repository.msg.InvestmentPlan13.RoundingDirection, com.tools20022.repository.msg.InvestmentPlan14.RoundingDirection,
					com.tools20022.repository.msg.RedemptionOrder14.Rounding, com.tools20022.repository.msg.InvestmentPlan15.RoundingDirection, com.tools20022.repository.msg.SubscriptionExecution13.Rounding,
					com.tools20022.repository.msg.SubscriptionExecution12.Rounding, com.tools20022.repository.msg.SubscriptionOrder15.Rounding, com.tools20022.repository.msg.RedemptionOrder15.Rounding,
					com.tools20022.repository.msg.RedemptionExecution16.Rounding, com.tools20022.repository.msg.SubscriptionOrder14.Rounding, com.tools20022.repository.msg.RedemptionExecution15.Rounding);
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingDirection";
			definition = "Rounding direction applied to fractional numbers, eg, round up.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Peg order for which a rounding direction is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#RoundDirection
	 * SecuritiesPegOrderInstruction.RoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPegOrderInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Peg order for which a rounding direction is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPegOrderInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPegOrderInstruction";
			definition = "Peg order for which a rounding direction is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoundingParameters";
				definition = "Parameters applied to a fractional number.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.RoundDirection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService, com.tools20022.repository.entity.RoundingParameters.RoundingModulus,
						com.tools20022.repository.entity.RoundingParameters.RoundingDirection, com.tools20022.repository.entity.RoundingParameters.RelatedPegOrderInstruction);
				derivationComponent_lazy = () -> Arrays.asList(RoundingParameters1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}