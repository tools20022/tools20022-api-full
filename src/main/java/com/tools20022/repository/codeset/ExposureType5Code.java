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
import com.tools20022.repository.codeset.ExposureType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying business area/type of trade causing the collateral
 * movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#BondForward
 * ExposureType5Code.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CashSettlement
 * ExposureType5Code.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CCPCollateral
 * ExposureType5Code.CCPCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#Commodities
 * ExposureType5Code.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CreditDefaultSwap
 * ExposureType5Code.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CreditLine
 * ExposureType5Code.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CreditSupport
 * ExposureType5Code.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CrossCurrencyIRS
 * ExposureType5Code.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#CrossProduct
 * ExposureType5Code.CrossProduct}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType5Code#Equity
 * ExposureType5Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#EquityOption
 * ExposureType5Code.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#EquitySwap
 * ExposureType5Code.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ExchangeTradedDerivatives
 * ExposureType5Code.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ExoticOption
 * ExposureType5Code.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#FixedIncome
 * ExposureType5Code.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ForeignExchange
 * ExposureType5Code.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ForwardForeignExchange
 * ExposureType5Code.ForwardForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType5Code#Futures
 * ExposureType5Code.Futures}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType5Code#FXOption
 * ExposureType5Code.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#Liquidity
 * ExposureType5Code.Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#OTCDerivatives
 * ExposureType5Code.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#RepurchaseAgreement
 * ExposureType5Code.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ReverseRepurchaseAgreement
 * ExposureType5Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SecuredLoan
 * ExposureType5Code.SecuredLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SecuritiesBuySellSellBuyBack
 * ExposureType5Code.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SecuritiesCrossProducts
 * ExposureType5Code.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SecuritiesLendingAndBorrowing
 * ExposureType5Code.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ShortSell
 * ExposureType5Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SingleCurrencyIRS
 * ExposureType5Code.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#SingleCurrencyIRSExotic
 * ExposureType5Code.SingleCurrencyIRSExotic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType5Code#Swaption
 * ExposureType5Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#ToBeAnnounced
 * ExposureType5Code.ToBeAnnounced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#TreasuryBonds
 * ExposureType5Code.TreasuryBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code#TreasuryCorssProduct
 * ExposureType5Code.TreasuryCorssProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
 * ExposureTypeCode}</li>
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
 * "ExposureType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying business area/type of trade causing the collateral movement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondForward"</li>
	 * </ul>
	 */
	public static final ExposureType5Code BondForward = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.BondForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CashSettlement = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CashSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPCollateral"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CCPCollateral = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CCPCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodities"</li>
	 * </ul>
	 */
	public static final ExposureType5Code Commodities = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.Commodities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwap"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CreditDefaultSwap = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CreditDefaultSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CreditLine = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CreditLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditSupport"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CreditSupport = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CreditSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CrossCurrencyIRS = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CrossCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossProduct"</li>
	 * </ul>
	 */
	public static final ExposureType5Code CrossProduct = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.CrossProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final ExposureType5Code Equity = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityOption"</li>
	 * </ul>
	 */
	public static final ExposureType5Code EquityOption = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.EquityOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquitySwap"</li>
	 * </ul>
	 */
	public static final ExposureType5Code EquitySwap = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.EquitySwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ExchangeTradedDerivatives = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ExchangeTradedDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExoticOption"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ExoticOption = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ExoticOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedIncome"</li>
	 * </ul>
	 */
	public static final ExposureType5Code FixedIncome = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.FixedIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ForeignExchange = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ForwardForeignExchange = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ForwardForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final ExposureType5Code Futures = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXOption"</li>
	 * </ul>
	 */
	public static final ExposureType5Code FXOption = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.FXOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * </ul>
	 */
	public static final ExposureType5Code Liquidity = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.Liquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType5Code OTCDerivatives = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.OTCDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType5Code RepurchaseAgreement = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.RepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ReverseRepurchaseAgreement = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredLoan"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SecuredLoan = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SecuredLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuySellSellBuyBack"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SecuritiesBuySellSellBuyBack = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesBuySellSellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCrossProducts"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SecuritiesCrossProducts = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesCrossProducts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingAndBorrowing"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SecuritiesLendingAndBorrowing = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesLendingAndBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ShortSell = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ShortSell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SingleCurrencyIRS = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRSExotic"</li>
	 * </ul>
	 */
	public static final ExposureType5Code SingleCurrencyIRSExotic = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRSExotic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * </ul>
	 */
	public static final ExposureType5Code Swaption = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.Swaption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnounced"</li>
	 * </ul>
	 */
	public static final ExposureType5Code ToBeAnnounced = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.ToBeAnnounced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryBonds"</li>
	 * </ul>
	 */
	public static final ExposureType5Code TreasuryBonds = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryBonds";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.TreasuryBonds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCorssProduct"</li>
	 * </ul>
	 */
	public static final ExposureType5Code TreasuryCorssProduct = new ExposureType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCorssProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType5Code.mmObject();
			codeName = ExposureTypeCode.TreasuryCorssProduct.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExposureType5Code> codesByName = new LinkedHashMap<>();

	protected ExposureType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureType5Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				trace_lazy = () -> ExposureTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureType5Code.BondForward, com.tools20022.repository.codeset.ExposureType5Code.CashSettlement,
						com.tools20022.repository.codeset.ExposureType5Code.CCPCollateral, com.tools20022.repository.codeset.ExposureType5Code.Commodities, com.tools20022.repository.codeset.ExposureType5Code.CreditDefaultSwap,
						com.tools20022.repository.codeset.ExposureType5Code.CreditLine, com.tools20022.repository.codeset.ExposureType5Code.CreditSupport, com.tools20022.repository.codeset.ExposureType5Code.CrossCurrencyIRS,
						com.tools20022.repository.codeset.ExposureType5Code.CrossProduct, com.tools20022.repository.codeset.ExposureType5Code.Equity, com.tools20022.repository.codeset.ExposureType5Code.EquityOption,
						com.tools20022.repository.codeset.ExposureType5Code.EquitySwap, com.tools20022.repository.codeset.ExposureType5Code.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureType5Code.ExoticOption,
						com.tools20022.repository.codeset.ExposureType5Code.FixedIncome, com.tools20022.repository.codeset.ExposureType5Code.ForeignExchange, com.tools20022.repository.codeset.ExposureType5Code.ForwardForeignExchange,
						com.tools20022.repository.codeset.ExposureType5Code.Futures, com.tools20022.repository.codeset.ExposureType5Code.FXOption, com.tools20022.repository.codeset.ExposureType5Code.Liquidity,
						com.tools20022.repository.codeset.ExposureType5Code.OTCDerivatives, com.tools20022.repository.codeset.ExposureType5Code.RepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureType5Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.ExposureType5Code.SecuredLoan,
						com.tools20022.repository.codeset.ExposureType5Code.SecuritiesBuySellSellBuyBack, com.tools20022.repository.codeset.ExposureType5Code.SecuritiesCrossProducts,
						com.tools20022.repository.codeset.ExposureType5Code.SecuritiesLendingAndBorrowing, com.tools20022.repository.codeset.ExposureType5Code.ShortSell,
						com.tools20022.repository.codeset.ExposureType5Code.SingleCurrencyIRS, com.tools20022.repository.codeset.ExposureType5Code.SingleCurrencyIRSExotic, com.tools20022.repository.codeset.ExposureType5Code.Swaption,
						com.tools20022.repository.codeset.ExposureType5Code.ToBeAnnounced, com.tools20022.repository.codeset.ExposureType5Code.TreasuryBonds, com.tools20022.repository.codeset.ExposureType5Code.TreasuryCorssProduct);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BondForward.getCodeName().get(), BondForward);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(CCPCollateral.getCodeName().get(), CCPCollateral);
		codesByName.put(Commodities.getCodeName().get(), Commodities);
		codesByName.put(CreditDefaultSwap.getCodeName().get(), CreditDefaultSwap);
		codesByName.put(CreditLine.getCodeName().get(), CreditLine);
		codesByName.put(CreditSupport.getCodeName().get(), CreditSupport);
		codesByName.put(CrossCurrencyIRS.getCodeName().get(), CrossCurrencyIRS);
		codesByName.put(CrossProduct.getCodeName().get(), CrossProduct);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(EquityOption.getCodeName().get(), EquityOption);
		codesByName.put(EquitySwap.getCodeName().get(), EquitySwap);
		codesByName.put(ExchangeTradedDerivatives.getCodeName().get(), ExchangeTradedDerivatives);
		codesByName.put(ExoticOption.getCodeName().get(), ExoticOption);
		codesByName.put(FixedIncome.getCodeName().get(), FixedIncome);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(ForwardForeignExchange.getCodeName().get(), ForwardForeignExchange);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(FXOption.getCodeName().get(), FXOption);
		codesByName.put(Liquidity.getCodeName().get(), Liquidity);
		codesByName.put(OTCDerivatives.getCodeName().get(), OTCDerivatives);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(SecuredLoan.getCodeName().get(), SecuredLoan);
		codesByName.put(SecuritiesBuySellSellBuyBack.getCodeName().get(), SecuritiesBuySellSellBuyBack);
		codesByName.put(SecuritiesCrossProducts.getCodeName().get(), SecuritiesCrossProducts);
		codesByName.put(SecuritiesLendingAndBorrowing.getCodeName().get(), SecuritiesLendingAndBorrowing);
		codesByName.put(ShortSell.getCodeName().get(), ShortSell);
		codesByName.put(SingleCurrencyIRS.getCodeName().get(), SingleCurrencyIRS);
		codesByName.put(SingleCurrencyIRSExotic.getCodeName().get(), SingleCurrencyIRSExotic);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(ToBeAnnounced.getCodeName().get(), ToBeAnnounced);
		codesByName.put(TreasuryBonds.getCodeName().get(), TreasuryBonds);
		codesByName.put(TreasuryCorssProduct.getCodeName().get(), TreasuryCorssProduct);
	}

	public static ExposureType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureType5Code[] values() {
		ExposureType5Code[] values = new ExposureType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureType5Code> {
		@Override
		public ExposureType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}