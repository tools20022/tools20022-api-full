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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.InvestmentFundFeeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of service for which a fee is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#AccountingFee
 * InvestmentFundFeeCode.AccountingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#BackEndLoad
 * InvestmentFundFeeCode.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#BrokerageFee
 * InvestmentFundFeeCode.BrokerageFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#ContingentDeferredSalesCharge
 * InvestmentFundFeeCode.ContingentDeferredSalesCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#CorrespondentBankCharge
 * InvestmentFundFeeCode.CorrespondentBankCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#CustodyFee
 * InvestmentFundFeeCode.CustodyFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#DilutionLevy
 * InvestmentFundFeeCode.DilutionLevy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Discount
 * InvestmentFundFeeCode.Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Equalisation
 * InvestmentFundFeeCode.Equalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#FrontEndLoad
 * InvestmentFundFeeCode.FrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#InitialCharge
 * InvestmentFundFeeCode.InitialCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Premium
 * InvestmentFundFeeCode.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#ServiceProvisionFee
 * InvestmentFundFeeCode.ServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Switch
 * InvestmentFundFeeCode.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#TransferFee
 * InvestmentFundFeeCode.TransferFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#UCITSCommission
 * InvestmentFundFeeCode.UCITSCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Commission
 * InvestmentFundFeeCode.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#ShippingCharge
 * InvestmentFundFeeCode.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#PostageCharge
 * InvestmentFundFeeCode.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#CommissionDePlacement
 * InvestmentFundFeeCode.CommissionDePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#AdditionalFee
 * InvestmentFundFeeCode.AdditionalFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#RegulatoryFee
 * InvestmentFundFeeCode.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#Penalty
 * InvestmentFundFeeCode.Penalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode#SpecialConcessions
 * InvestmentFundFeeCode.SpecialConcessions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
 * InvestmentFundFee1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestmentFundFee2Code
 * InvestmentFundFee2Code}</li>
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
 * "InvestmentFundFeeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of service for which a fee is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundFeeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fee paid for accounting services rendered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid for accounting services rendered."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode AccountingFee = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingFee";
			definition = "Fee paid for accounting services rendered.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Fee paid by the investor to the fund or fund management company when
	 * redeeming.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee paid by the investor to the fund or fund management company when redeeming."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode BackEndLoad = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			definition = "Fee paid by the investor to the fund or fund management company when redeeming.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "BEND";
		}
	};
	/**
	 * Fee paid to a broker for services provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRKF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid to a broker for services provided."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode BrokerageFee = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageFee";
			definition = "Fee paid to a broker for services provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "BRKF";
		}
	};
	/**
	 * Deferred sales charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingentDeferredSalesCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deferred sales charge."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode ContingentDeferredSalesCharge = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingentDeferredSalesCharge";
			definition = "Deferred sales charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "CDSC";
		}
	};
	/**
	 * In investment funds, the charge of the correspondent bank for
	 * transferring money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, the charge of the correspondent bank for transferring money."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode CorrespondentBankCharge = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharge";
			definition = "In investment funds, the charge of the correspondent bank for transferring money.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "CBCH";
		}
	};
	/**
	 * Fee paid to a custodian in respect of custodial services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee paid to a custodian in respect of custodial services."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode CustodyFee = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyFee";
			definition = "Fee paid to a custodian in respect of custodial services.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * In investment funds, a charge payable by the investor covering bid-offer
	 * spreads and dealing charges for the underlying investments. The dilution
	 * levy is paid to the fund for the benefit of other unit holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DilutionLevy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode DilutionLevy = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DilutionLevy";
			definition = "In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "DLEV";
		}
	};
	/**
	 * Charge that has been reduced by a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge that has been reduced by a fund."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Discount = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			definition = "Charge that has been reduced by a fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * The part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive or performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Equalisation = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * Fee paid by the investor to the fund or fund management company when
	 * subscribing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee paid by the investor to the fund or fund management company when subscribing."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode FrontEndLoad = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			definition = "Fee paid by the investor to the fund or fund management company when subscribing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Charge paid at the time of the first subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge paid at the time of the first subscription."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode InitialCharge = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialCharge";
			definition = "Charge paid at the time of the first subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * In investment funds, pre-arranged addition to the trade amount based on
	 * the published net asset value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, pre-arranged addition to the trade amount based on the published net asset value."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Premium = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "In investment funds, pre-arranged addition to the trade amount based on the published net asset value.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Fee paid by the investor to a distributor/intermediary or other service
	 * provider for the provision of financial services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee paid by the investor to a distributor/intermediary or other service provider for the provision of financial services."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode ServiceProvisionFee = new InvestmentFundFeeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			definition = "Fee paid by the investor to a distributor/intermediary or other service provider for the provision of financial services.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * In investment funds, charge related to a switch transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, charge related to a switch transaction."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Switch = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			definition = "In investment funds, charge related to a switch transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * In investment funds, a fee charged for the transfer of ownership of an
	 * investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In investment funds, a fee charged for the transfer of ownership of an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode TransferFee = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFee";
			definition = "In investment funds, a fee charged for the transfer of ownership of an investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Charges paid by the investor to the fund company for subscription and
	 * redemption orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges paid by the investor to the fund company for subscription and redemption orders."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode UCITSCommission = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITSCommission";
			definition = "Charges paid by the investor to the fund company for subscription and redemption orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "UCIC";
		}
	};
	/**
	 * Amount paid out by the fund to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount paid out by the fund to a third party."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Commission = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount paid out by the fund to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Charge for shipping, including the insurance of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge for shipping, including the insurance of securities."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode ShippingCharge = new InvestmentFundFeeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			definition = "Charge for shipping, including the insurance of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Charge paid for the postage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge paid for the postage."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode PostageCharge = new InvestmentFundFeeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			definition = "Charge paid for the postage.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Amount of cash due to an intermediary for selling a product, or services,
	 * to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash due to an intermediary for selling a product, or services, to a third party."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode CommissionDePlacement = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDePlacement";
			definition = "Amount of cash due to an intermediary for selling a product, or services, to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "CDPL";
		}
	};
	/**
	 * Additional fee not covered by another fee type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional fee not covered by another fee type."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode AdditionalFee = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFee";
			definition = "Additional fee not covered by another fee type.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "ADDF";
		}
	};
	/**
	 * Fee charged by a regulatory authority, for example, securities and
	 * exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::REGF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged by a regulatory authority, for example, securities and exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode RegulatoryFee = new InvestmentFundFeeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			definition = "Fee charged by a regulatory authority, for example, securities and exchange fees.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "REGF";
		}
	};
	/**
	 * Fee charged to the investor for early redemption of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged to the investor for early redemption of the fund."</li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode Penalty = new InvestmentFundFeeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Penalty";
			definition = "Fee charged to the investor for early redemption of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "PENA";
		}
	};
	/**
	 * Fees, drawdown, or other reduction from or in addition to the deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
	 * InvestmentFundFeeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SPCN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcessions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees, drawdown, or other reduction from or in addition to the deal price."
	 * </li>
	 * </ul>
	 */
	public static final InvestmentFundFeeCode SpecialConcessions = new InvestmentFundFeeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SPCN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcessions";
			definition = "Fees, drawdown, or other reduction from or in addition to the deal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFeeCode.mmObject();
			codeName = "SPCN";
		}
	};
	final static private LinkedHashMap<String, InvestmentFundFeeCode> codesByName = new LinkedHashMap<>();

	protected InvestmentFundFeeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundFeeCode";
				definition = "Specifies the type of service for which a fee is asked or paid.";
				derivation_lazy = () -> Arrays.asList(InvestmentFundFee1Code.mmObject(), InvestmentFundFee2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundFeeCode.AccountingFee, com.tools20022.repository.codeset.InvestmentFundFeeCode.BackEndLoad,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.BrokerageFee, com.tools20022.repository.codeset.InvestmentFundFeeCode.ContingentDeferredSalesCharge,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.CorrespondentBankCharge, com.tools20022.repository.codeset.InvestmentFundFeeCode.CustodyFee,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.DilutionLevy, com.tools20022.repository.codeset.InvestmentFundFeeCode.Discount, com.tools20022.repository.codeset.InvestmentFundFeeCode.Equalisation,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.FrontEndLoad, com.tools20022.repository.codeset.InvestmentFundFeeCode.InitialCharge, com.tools20022.repository.codeset.InvestmentFundFeeCode.Premium,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.ServiceProvisionFee, com.tools20022.repository.codeset.InvestmentFundFeeCode.Switch, com.tools20022.repository.codeset.InvestmentFundFeeCode.TransferFee,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.UCITSCommission, com.tools20022.repository.codeset.InvestmentFundFeeCode.Commission, com.tools20022.repository.codeset.InvestmentFundFeeCode.ShippingCharge,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.PostageCharge, com.tools20022.repository.codeset.InvestmentFundFeeCode.CommissionDePlacement,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.AdditionalFee, com.tools20022.repository.codeset.InvestmentFundFeeCode.RegulatoryFee, com.tools20022.repository.codeset.InvestmentFundFeeCode.Penalty,
						com.tools20022.repository.codeset.InvestmentFundFeeCode.SpecialConcessions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountingFee.getCodeName().get(), AccountingFee);
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(BrokerageFee.getCodeName().get(), BrokerageFee);
		codesByName.put(ContingentDeferredSalesCharge.getCodeName().get(), ContingentDeferredSalesCharge);
		codesByName.put(CorrespondentBankCharge.getCodeName().get(), CorrespondentBankCharge);
		codesByName.put(CustodyFee.getCodeName().get(), CustodyFee);
		codesByName.put(DilutionLevy.getCodeName().get(), DilutionLevy);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Equalisation.getCodeName().get(), Equalisation);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(InitialCharge.getCodeName().get(), InitialCharge);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(TransferFee.getCodeName().get(), TransferFee);
		codesByName.put(UCITSCommission.getCodeName().get(), UCITSCommission);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(CommissionDePlacement.getCodeName().get(), CommissionDePlacement);
		codesByName.put(AdditionalFee.getCodeName().get(), AdditionalFee);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(Penalty.getCodeName().get(), Penalty);
		codesByName.put(SpecialConcessions.getCodeName().get(), SpecialConcessions);
	}

	public static InvestmentFundFeeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundFeeCode[] values() {
		InvestmentFundFeeCode[] values = new InvestmentFundFeeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundFeeCode> {
		@Override
		public InvestmentFundFeeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundFeeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}