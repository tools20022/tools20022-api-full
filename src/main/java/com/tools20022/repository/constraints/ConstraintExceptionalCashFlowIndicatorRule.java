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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If Exceptional NetCashFlow Indicator is "true" or "1" (Yes), then
 * CashInForecastDetails/ExceptionalCashFlowIndicator and
 * CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.
 */
public class ConstraintExceptionalCashFlowIndicatorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1
	 * FundCashForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast1> forFundCashForecast1 = new MMConstraint<FundCashForecast1>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.";
			owner_lazy = () -> FundCashForecast1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3
	 * FundCashForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forFundCashForecast7
	 * ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast3> forFundCashForecast3 = new MMConstraint<FundCashForecast3>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast7);
			owner_lazy = () -> FundCashForecast3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2
	 * FundCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then either SortingCriteriaDetails/ForecastBreakdownDetails/CashInForecastDetails/ExceptionalCashFlowIndicator or SortingCriteriaDetails/ForecastBreakdownDetails/CashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast2> forFundCashForecast2 = new MMConstraint<FundCashForecast2>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then either SortingCriteriaDetails/ForecastBreakdownDetails/CashInForecastDetails/ExceptionalCashFlowIndicator or SortingCriteriaDetails/ForecastBreakdownDetails/CashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present.";
			owner_lazy = () -> FundCashForecast2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4
	 * FundCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then one of the following must be present: \nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forFundCashForecast6
	 * ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast4> forFundCashForecast4 = new MMConstraint<FundCashForecast4>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then one of the following must be present: \nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast6);
			owner_lazy = () -> FundCashForecast4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2
	 * EstimatedFundCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either SortingCriteriaDetails/ForecastBreakdownDetails/EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or SortingCriteriaDetails/ForecastBreakdownDetails/EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast2> forEstimatedFundCashForecast2 = new MMConstraint<EstimatedFundCashForecast2>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either SortingCriteriaDetails/ForecastBreakdownDetails/EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or SortingCriteriaDetails/ForecastBreakdownDetails/EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present.";
			owner_lazy = () -> EstimatedFundCashForecast2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4
	 * EstimatedFundCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then one of the following must be present: \nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast5
	 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast5}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast4> forEstimatedFundCashForecast4 = new MMConstraint<EstimatedFundCashForecast4>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then one of the following must be present: \nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast5);
			owner_lazy = () -> EstimatedFundCashForecast4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1
	 * EstimatedFundCashForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast1> forEstimatedFundCashForecast1 = new MMConstraint<EstimatedFundCashForecast1>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present.";
			owner_lazy = () -> EstimatedFundCashForecast1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3
	 * EstimatedFundCashForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast6
	 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast6}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast3> forEstimatedFundCashForecast3 = new MMConstraint<EstimatedFundCashForecast3>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast6);
			owner_lazy = () -> EstimatedFundCashForecast3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forFundCashForecast3
	 * ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast3}</li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast7> forFundCashForecast7 = new MMConstraint<FundCashForecast7>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlow Indicator is \"true\" or \"1\" (Yes), then CashInForecastDetails/ExceptionalCashFlowIndicator and CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast3;
			owner_lazy = () -> FundCashForecast7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be present. Both may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast3
	 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast3}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast6> forEstimatedFundCashForecast6 = new MMConstraint<EstimatedFundCashForecast6>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If Exceptional NetCashFlowIndicator is \"true\" or \"1\" (Yes), then either EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be present. Both may be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast3;
			owner_lazy = () -> EstimatedFundCashForecast6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forFundCashForecast4
	 * ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast4}</li>
	 * </ul>
	 */
	public static final MMConstraint<FundCashForecast6> forFundCashForecast6 = new MMConstraint<FundCashForecast6>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkFundCashForecast6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forFundCashForecast4;
			owner_lazy = () -> FundCashForecast6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast4
	 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast4}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EstimatedFundCashForecast5> forEstimatedFundCashForecast5 = new MMConstraint<EstimatedFundCashForecast5>() {
		{
			validator = ConstraintExceptionalCashFlowIndicatorRule::checkEstimatedFundCashForecast5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicatorRule";
			definition = "If ExceptionalNetCashFlowIndicator is \"true\" or \"1\" (Yes), then at least one or more of the following must be present:\r\nBreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashInForecast/ExceptionalCashFlowIndicator, or\r\nBreakdownByUserDefinedParameter/CashOutForecast/ExceptionalCashFlowIndicator.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast4;
			owner_lazy = () -> EstimatedFundCashForecast5.mmObject();
		}
	};

	/**
	 * If Exceptional NetCashFlow Indicator is "true" or "1" (Yes), then
	 * CashInForecastDetails/ExceptionalCashFlowIndicator and
	 * CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.
	 */
	public static void checkFundCashForecast1(FundCashForecast1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlow Indicator is "true" or "1" (Yes), then
	 * CashInForecastDetails/ExceptionalCashFlowIndicator and
	 * CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.
	 */
	public static void checkFundCashForecast3(FundCashForecast3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then either
	 * SortingCriteriaDetails/ForecastBreakdownDetails/CashInForecastDetails/
	 * ExceptionalCashFlowIndicator or
	 * SortingCriteriaDetails/ForecastBreakdownDetails
	 * /CashOutForecastDetails/ExceptionalCashFlowIndicator, or both, must be
	 * present.
	 */
	public static void checkFundCashForecast2(FundCashForecast2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then one of
	 * the following must be present:
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByUserDefinedParameter
	 * /CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByUserDefinedParameter
	 * /CashOutForecast/ExceptionalCashFlowIndicator.
	 */
	public static void checkFundCashForecast4(FundCashForecast4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlowIndicator is "true" or "1" (Yes), then either
	 * SortingCriteriaDetails
	 * /ForecastBreakdownDetails/EstimatedCashInForecastDetails
	 * /ExceptionalCashFlowIndicator or
	 * SortingCriteriaDetails/ForecastBreakdownDetails
	 * /EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both,
	 * must be present.
	 */
	public static void checkEstimatedFundCashForecast2(EstimatedFundCashForecast2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then one of
	 * the following must be present:
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByUserDefinedParameter
	 * /CashInForecast/ExceptionalCashFlowIndicator, or
	 * BreakdownByUserDefinedParameter
	 * /CashOutForecast/ExceptionalCashFlowIndicator.
	 */
	public static void checkEstimatedFundCashForecast4(EstimatedFundCashForecast4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlowIndicator is "true" or "1" (Yes), then either
	 * EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and
	 * EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both,
	 * must be present.
	 */
	public static void checkEstimatedFundCashForecast1(EstimatedFundCashForecast1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlowIndicator is "true" or "1" (Yes), then either
	 * EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator and
	 * EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator, or both,
	 * must be present.
	 */
	public static void checkEstimatedFundCashForecast3(EstimatedFundCashForecast3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlow Indicator is "true" or "1" (Yes), then
	 * CashInForecastDetails/ExceptionalCashFlowIndicator and
	 * CashOutForecastDetails/ ExceptionalCashFlowIndicator must be present.
	 */
	public static void checkFundCashForecast7(FundCashForecast7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Exceptional NetCashFlowIndicator is "true" or "1" (Yes), then either
	 * EstimatedCashInForecastDetails/ExceptionalCashFlowIndicator or
	 * EstimatedCashOutForecastDetails/ExceptionalCashFlowIndicator must be
	 * present. Both may be present.
	 */
	public static void checkEstimatedFundCashForecast6(EstimatedFundCashForecast6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then at least
	 * one or more of the following must be present:<br>
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashInForecast/
	 * ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashOutForecast/
	 * ExceptionalCashFlowIndicator.<br>
	 */
	public static void checkFundCashForecast6(FundCashForecast6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ExceptionalNetCashFlowIndicator is "true" or "1" (Yes), then at least
	 * one or more of the following must be present:<br>
	 * BreakdownByParty/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByParty/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCountry/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashInForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByCurrency/CashOutForecast/ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashInForecast/
	 * ExceptionalCashFlowIndicator, or<br>
	 * BreakdownByUserDefinedParameter/CashOutForecast/
	 * ExceptionalCashFlowIndicator.
	 */
	public static void checkEstimatedFundCashForecast5(EstimatedFundCashForecast5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}