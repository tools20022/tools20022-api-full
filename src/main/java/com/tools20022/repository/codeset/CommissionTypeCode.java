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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CommissionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service for which the commission is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#ClientDirected
 * CommissionTypeCode.ClientDirected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#StepOut
 * CommissionTypeCode.StepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#FrontEnd
 * CommissionTypeCode.FrontEnd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#Initial
 * CommissionTypeCode.Initial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#BackEnd
 * CommissionTypeCode.BackEnd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#Trailer
 * CommissionTypeCode.Trailer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#Regular
 * CommissionTypeCode.Regular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#StepIn
 * CommissionTypeCode.StepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#SoftDollar
 * CommissionTypeCode.SoftDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#SoftDollarStepIn
 * CommissionTypeCode.SoftDollarStepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#SoftDollarStepOut
 * CommissionTypeCode.SoftDollarStepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#PlanSponsor
 * CommissionTypeCode.PlanSponsor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#PercentageOfPrincipal
 * CommissionTypeCode.PercentageOfPrincipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#Markup
 * CommissionTypeCode.Markup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#CommissionDePlacement
 * CommissionTypeCode.CommissionDePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#BrokerCredit
 * CommissionTypeCode.BrokerCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionTypeCode#Other
 * CommissionTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode#FundBasedRenewal
 * CommissionTypeCode.FundBasedRenewal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType5Code
 * CommissionType5Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which the commission is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommissionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commission is as per client agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientDirected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is as per client agreement."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode ClientDirected = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientDirected";
			definition = "Commission is as per client agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "CLDI";
		}
	};
	/**
	 * Commission for a step-out trade, charged by the step-out broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-out trade, charged by the step-out broker."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode StepOut = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StepOut";
			definition = "Commission for a step-out trade, charged by the step-out broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "STEP";
		}
	};
	/**
	 * Type of service for which the commission is asked or paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of service for which the commission is asked or paid."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode FrontEnd = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEnd";
			definition = "Type of service for which the commission is asked or paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Commission paid at the time of first subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission paid at the time of first subscription."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode Initial = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Initial";
			definition = "Commission paid at the time of first subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Commission for redeeming an investment, when an investor redeems an
	 * investment fund within a certain period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeCode BackEnd = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEnd";
			definition = "Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Commission that is calculated on the position of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that is calculated on the position of an account."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode Trailer = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trailer";
			definition = "Commission that is calculated on the position of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Commission that is regular.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission that is regular."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode Regular = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Commission that is regular.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Commission for a step-in trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission for a step-in trade."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode StepIn = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StepIn";
			definition = "Commission for a step-in trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "STEI";
		}
	};
	/**
	 * Soft dollar commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Soft dollar commission."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode SoftDollar = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollar";
			definition = "Soft dollar commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * Commission for a step-in trade, charged by the step-in broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission for a step-in trade, charged by the step-in broker."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode SoftDollarStepIn = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepIn";
			definition = "Commission for a step-in trade, charged by the step-in broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "SOIN";
		}
	};
	/**
	 * Commission that combines soft dollar and step-out commission
	 * characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that combines soft dollar and step-out commission characteristics."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeCode SoftDollarStepOut = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SoftDollarStepOut";
			definition = "Commission that combines soft dollar and step-out commission characteristics.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "SOUT";
		}
	};
	/**
	 * Commission for a plan sponsor's services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanSponsor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission for a plan sponsor's services."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode PlanSponsor = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlanSponsor";
			definition = "Commission for a plan sponsor's services.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "PLAN";
		}
	};
	/**
	 * Commission is a percentage of principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is a percentage of principal."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode PercentageOfPrincipal = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPrincipal";
			definition = "Commission is a percentage of principal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "PERN";
		}
	};
	/**
	 * Amount or percentage that is added to an offer price when an investor
	 * buys from a broker or market maker. In this case, the price is adjusted
	 * to reflect changing market conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Markup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeCode Markup = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Markup";
			definition = "Amount or percentage that is added to an offer price when an investor buys from a broker or market maker.  In this case, the price is adjusted to reflect changing market conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Amount of cash due to an intermediary for selling a product, or services,
	 * to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash due to an intermediary for selling a product, or services, to a third party."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeCode CommissionDePlacement = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionDePlacement";
			definition = "Amount of cash due to an intermediary for selling a product, or services, to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "CDPL";
		}
	};
	/**
	 * Amount financed to cover the back-end load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount financed to cover the back-end load."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode BrokerCredit = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerCredit";
			definition = "Amount financed to cover the back-end load.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "BCRD";
		}
	};
	/**
	 * Commission is another type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission is another type of transaction."</li>
	 * </ul>
	 */
	public static final CommissionTypeCode Other = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Commission is another type of transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Annual fund based renewal commission, expressed as a percentage of the
	 * deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeCode
	 * CommissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBasedRenewal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual fund based renewal commission, expressed as a percentage of the deal."
	 * </li>
	 * </ul>
	 */
	public static final CommissionTypeCode FundBasedRenewal = new CommissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundBasedRenewal";
			definition = "Annual fund based renewal commission, expressed as a percentage of the deal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionTypeCode.mmObject();
			codeName = "RNEW";
		}
	};
	final static private LinkedHashMap<String, CommissionTypeCode> codesByName = new LinkedHashMap<>();

	protected CommissionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionTypeCode";
				definition = "Type of service for which the commission is asked or paid.";
				derivation_lazy = () -> Arrays.asList(CommissionType5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionTypeCode.ClientDirected, com.tools20022.repository.codeset.CommissionTypeCode.StepOut,
						com.tools20022.repository.codeset.CommissionTypeCode.FrontEnd, com.tools20022.repository.codeset.CommissionTypeCode.Initial, com.tools20022.repository.codeset.CommissionTypeCode.BackEnd,
						com.tools20022.repository.codeset.CommissionTypeCode.Trailer, com.tools20022.repository.codeset.CommissionTypeCode.Regular, com.tools20022.repository.codeset.CommissionTypeCode.StepIn,
						com.tools20022.repository.codeset.CommissionTypeCode.SoftDollar, com.tools20022.repository.codeset.CommissionTypeCode.SoftDollarStepIn, com.tools20022.repository.codeset.CommissionTypeCode.SoftDollarStepOut,
						com.tools20022.repository.codeset.CommissionTypeCode.PlanSponsor, com.tools20022.repository.codeset.CommissionTypeCode.PercentageOfPrincipal, com.tools20022.repository.codeset.CommissionTypeCode.Markup,
						com.tools20022.repository.codeset.CommissionTypeCode.CommissionDePlacement, com.tools20022.repository.codeset.CommissionTypeCode.BrokerCredit, com.tools20022.repository.codeset.CommissionTypeCode.Other,
						com.tools20022.repository.codeset.CommissionTypeCode.FundBasedRenewal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClientDirected.getCodeName().get(), ClientDirected);
		codesByName.put(StepOut.getCodeName().get(), StepOut);
		codesByName.put(FrontEnd.getCodeName().get(), FrontEnd);
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(BackEnd.getCodeName().get(), BackEnd);
		codesByName.put(Trailer.getCodeName().get(), Trailer);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(StepIn.getCodeName().get(), StepIn);
		codesByName.put(SoftDollar.getCodeName().get(), SoftDollar);
		codesByName.put(SoftDollarStepIn.getCodeName().get(), SoftDollarStepIn);
		codesByName.put(SoftDollarStepOut.getCodeName().get(), SoftDollarStepOut);
		codesByName.put(PlanSponsor.getCodeName().get(), PlanSponsor);
		codesByName.put(PercentageOfPrincipal.getCodeName().get(), PercentageOfPrincipal);
		codesByName.put(Markup.getCodeName().get(), Markup);
		codesByName.put(CommissionDePlacement.getCodeName().get(), CommissionDePlacement);
		codesByName.put(BrokerCredit.getCodeName().get(), BrokerCredit);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(FundBasedRenewal.getCodeName().get(), FundBasedRenewal);
	}

	public static CommissionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommissionTypeCode[] values() {
		CommissionTypeCode[] values = new CommissionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommissionTypeCode> {
		@Override
		public CommissionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommissionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}