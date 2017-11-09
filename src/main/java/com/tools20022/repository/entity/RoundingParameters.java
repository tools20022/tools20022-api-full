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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RoundingParameters1
 * RoundingParameters1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
 * InvestmentAccountService.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
 * RoundingParameters.mmInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingModulus
 * RoundingParameters.mmRoundingModulus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
 * RoundingParameters.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRelatedPegOrderInstruction
 * RoundingParameters.mmRelatedPegOrderInstruction}</li>
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
 * "RoundingParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to a fractional number."</li>
 * </ul>
 */
public class RoundingParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccountService investmentAccountService;
	/**
	 * Investment account services for which rounding parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
	 * InvestmentAccountService.mmRoundingMethod}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountService";
			definition = "Investment account services for which rounding parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected DecimalNumber roundingModulus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RoundingParameters1#mmRoundingModulus
	 * RoundingParameters1.mmRoundingModulus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRoundingModulus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RoundingParameters1.mmRoundingModulus);
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingModulus";
			definition = "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected RoundingDirectionCode roundingDirection;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RoundingParameters1#mmRoundingDirection
	 * RoundingParameters1.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmRoundingDirection
	 * InvestmentPlan4.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmRoundingDirection
	 * InvestmentPlan6.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmRoundingDirection
	 * InvestmentPlan5.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmRoundingDirection
	 * InvestmentPlan7.mmRoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#mmRounding
	 * Transfer10.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#mmRounding
	 * Transfer14.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#mmRounding
	 * Transfer24.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#mmRounding
	 * Transfer9.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#mmRounding
	 * Transfer12.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#mmRounding
	 * Transfer20.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#mmRounding
	 * Transfer13.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#mmRounding
	 * Transfer23.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#mmRounding
	 * Transfer8.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#mmRounding
	 * Transfer11.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#mmRounding
	 * Transfer19.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmRounding
	 * RedemptionOrder3.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmRounding
	 * RedemptionOrder5.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmRounding
	 * RedemptionExecution3.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmRounding
	 * RedemptionExecution5.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmRounding
	 * RedemptionOrder7.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmRounding
	 * RedemptionOrder4.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmRounding
	 * RedemptionOrder6.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmRounding
	 * RedemptionExecution4.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRounding
	 * RedemptionExecution6.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRounding
	 * RedemptionOrder8.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmRounding
	 * SubscriptionOrder3.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmRounding
	 * SubscriptionOrder5.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmRounding
	 * SubscriptionExecution3.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmRounding
	 * SubscriptionExecution5.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmRounding
	 * SubscriptionOrder7.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmRounding
	 * SubscriptionOrder4.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmRounding
	 * SubscriptionOrder6.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmRounding
	 * SubscriptionExecution4.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRounding
	 * SubscriptionExecution6.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmRounding
	 * SubscriptionOrder8.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmRoundingDirection
	 * InvestmentPlan9.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmRoundingDirection
	 * InvestmentPlan8.mmRoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#mmRounding
	 * Transfer27.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#mmRounding
	 * Transfer28.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmRoundingDirection
	 * InvestmentPlan10.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmRoundingDirection
	 * InvestmentPlan11.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmRoundingDirection
	 * InvestmentPlan12.mmRoundingDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmRounding
	 * Transfer31.mmRounding}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmRounding
	 * Transfer30.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmRoundingDirection
	 * InvestmentPlan13.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmRoundingDirection
	 * InvestmentPlan14.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRounding
	 * RedemptionOrder14.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmRoundingDirection
	 * InvestmentPlan15.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRounding
	 * SubscriptionExecution13.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmRounding
	 * SubscriptionExecution12.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmRounding
	 * SubscriptionOrder15.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmRounding
	 * RedemptionOrder15.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmRounding
	 * RedemptionExecution16.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRounding
	 * SubscriptionOrder14.mmRounding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRounding
	 * RedemptionExecution15.mmRounding}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRoundingDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RoundingParameters1.mmRoundingDirection, InvestmentPlan4.mmRoundingDirection, InvestmentPlan6.mmRoundingDirection, InvestmentPlan5.mmRoundingDirection, InvestmentPlan7.mmRoundingDirection,
					Transfer10.mmRounding, Transfer14.mmRounding, Transfer24.mmRounding, Transfer9.mmRounding, Transfer12.mmRounding, Transfer20.mmRounding, Transfer13.mmRounding, Transfer23.mmRounding, Transfer8.mmRounding,
					Transfer11.mmRounding, Transfer19.mmRounding, RedemptionOrder3.mmRounding, RedemptionOrder5.mmRounding, RedemptionExecution3.mmRounding, RedemptionExecution5.mmRounding, RedemptionOrder7.mmRounding,
					RedemptionOrder4.mmRounding, RedemptionOrder6.mmRounding, RedemptionExecution4.mmRounding, RedemptionExecution6.mmRounding, RedemptionOrder8.mmRounding, SubscriptionOrder3.mmRounding, SubscriptionOrder5.mmRounding,
					SubscriptionExecution3.mmRounding, SubscriptionExecution5.mmRounding, SubscriptionOrder7.mmRounding, SubscriptionOrder4.mmRounding, SubscriptionOrder6.mmRounding, SubscriptionExecution4.mmRounding,
					SubscriptionExecution6.mmRounding, SubscriptionOrder8.mmRounding, InvestmentPlan9.mmRoundingDirection, InvestmentPlan8.mmRoundingDirection, Transfer27.mmRounding, Transfer28.mmRounding,
					InvestmentPlan10.mmRoundingDirection, InvestmentPlan11.mmRoundingDirection, InvestmentPlan12.mmRoundingDirection, Transfer31.mmRounding, Transfer30.mmRounding, InvestmentPlan13.mmRoundingDirection,
					InvestmentPlan14.mmRoundingDirection, RedemptionOrder14.mmRounding, InvestmentPlan15.mmRoundingDirection, SubscriptionExecution13.mmRounding, SubscriptionExecution12.mmRounding, SubscriptionOrder15.mmRounding,
					RedemptionOrder15.mmRounding, RedemptionExecution16.mmRounding, SubscriptionOrder14.mmRounding, RedemptionExecution15.mmRounding);
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingDirection";
			definition = "Rounding direction applied to fractional numbers, eg, round up.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	protected SecuritiesPegOrderInstruction relatedPegOrderInstruction;
	/**
	 * Peg order for which a rounding direction is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
	 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPegOrderInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RoundingParameters.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPegOrderInstruction";
			definition = "Peg order for which a rounding direction is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmRoundDirection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingParameters";
				definition = "Parameters applied to a fractional number.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmRoundDirection);
				element_lazy = () -> Arrays.asList(RoundingParameters.mmInvestmentAccountService, RoundingParameters.mmRoundingModulus, RoundingParameters.mmRoundingDirection, RoundingParameters.mmRelatedPegOrderInstruction);
				derivationComponent_lazy = () -> Arrays.asList(RoundingParameters1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountService getInvestmentAccountService() {
		return investmentAccountService;
	}

	public void setInvestmentAccountService(com.tools20022.repository.entity.InvestmentAccountService investmentAccountService) {
		this.investmentAccountService = investmentAccountService;
	}

	public DecimalNumber getRoundingModulus() {
		return roundingModulus;
	}

	public void setRoundingModulus(DecimalNumber roundingModulus) {
		this.roundingModulus = roundingModulus;
	}

	public RoundingDirectionCode getRoundingDirection() {
		return roundingDirection;
	}

	public void setRoundingDirection(RoundingDirectionCode roundingDirection) {
		this.roundingDirection = roundingDirection;
	}

	public SecuritiesPegOrderInstruction getRelatedPegOrderInstruction() {
		return relatedPegOrderInstruction;
	}

	public void setRelatedPegOrderInstruction(com.tools20022.repository.entity.SecuritiesPegOrderInstruction relatedPegOrderInstruction) {
		this.relatedPegOrderInstruction = relatedPegOrderInstruction;
	}
}