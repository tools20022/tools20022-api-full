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
import com.tools20022.repository.codeset.ExposureType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CrossCurrencyIRS
 * ExposureType1Code.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#Commodities
 * ExposureType1Code.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CreditDefaultSwap
 * ExposureType1Code.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CrossProduct
 * ExposureType1Code.CrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CreditSupport
 * ExposureType1Code.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CreditLine
 * ExposureType1Code.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#EquityOption
 * ExposureType1Code.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#EquitySwap
 * ExposureType1Code.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ExoticOption
 * ExposureType1Code.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ExchangeTradedDerivatives
 * ExposureType1Code.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#FixedIncome
 * ExposureType1Code.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ForwardForeignExchange
 * ExposureType1Code.ForwardForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ForeignExchange
 * ExposureType1Code.ForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType1Code#Futures
 * ExposureType1Code.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#Liquidity
 * ExposureType1Code.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType1Code#FXOption
 * ExposureType1Code.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#OTCDerivatives
 * ExposureType1Code.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#CashSettlement
 * ExposureType1Code.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#RepurchaseAgreement
 * ExposureType1Code.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SecuritiesBuySellSellBuyBack
 * ExposureType1Code.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SingleCurrencyIRSExotic
 * ExposureType1Code.SingleCurrencyIRSExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SingleCurrencyIRS
 * ExposureType1Code.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SecuritiesCrossProducts
 * ExposureType1Code.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SecuritiesLendingAndBorrowing
 * ExposureType1Code.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#SecuredLoan
 * ExposureType1Code.SecuredLoan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType1Code#Swaption
 * ExposureType1Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#TreasuryCorssProduct
 * ExposureType1Code.TreasuryCorssProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#BondForward
 * ExposureType1Code.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ReverseRepurchaseAgreement
 * ExposureType1Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code#ToBeAnnounced
 * ExposureType1Code.ToBeAnnounced}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CCIR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExposureType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying business area/type of trade causing the collateral movement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CrossCurrencyIRS = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CrossCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodities"</li>
	 * </ul>
	 */
	public static final ExposureType1Code Commodities = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.Commodities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwap"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CreditDefaultSwap = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CreditDefaultSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossProduct"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CrossProduct = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CrossProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditSupport"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CreditSupport = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CreditSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CreditLine = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CreditLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityOption"</li>
	 * </ul>
	 */
	public static final ExposureType1Code EquityOption = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.EquityOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquitySwap"</li>
	 * </ul>
	 */
	public static final ExposureType1Code EquitySwap = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.EquitySwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExoticOption"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ExoticOption = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ExoticOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ExchangeTradedDerivatives = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ExchangeTradedDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedIncome"</li>
	 * </ul>
	 */
	public static final ExposureType1Code FixedIncome = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.FixedIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ForwardForeignExchange = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ForwardForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ForeignExchange = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final ExposureType1Code Futures = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * </ul>
	 */
	public static final ExposureType1Code Liquidity = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.Liquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXOption"</li>
	 * </ul>
	 */
	public static final ExposureType1Code FXOption = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.FXOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType1Code OTCDerivatives = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.OTCDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final ExposureType1Code CashSettlement = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.CashSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType1Code RepurchaseAgreement = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.RepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuySellSellBuyBack"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SecuritiesBuySellSellBuyBack = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesBuySellSellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRSExotic"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SingleCurrencyIRSExotic = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRSExotic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SingleCurrencyIRS = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCrossProducts"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SecuritiesCrossProducts = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesCrossProducts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingAndBorrowing"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SecuritiesLendingAndBorrowing = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesLendingAndBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredLoan"</li>
	 * </ul>
	 */
	public static final ExposureType1Code SecuredLoan = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.SecuredLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * </ul>
	 */
	public static final ExposureType1Code Swaption = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.Swaption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCorssProduct"</li>
	 * </ul>
	 */
	public static final ExposureType1Code TreasuryCorssProduct = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCorssProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.TreasuryCorssProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondForward"</li>
	 * </ul>
	 */
	public static final ExposureType1Code BondForward = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.BondForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ReverseRepurchaseAgreement = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnounced"</li>
	 * </ul>
	 */
	public static final ExposureType1Code ToBeAnnounced = new ExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType1Code.mmObject();
			codeName = ExposureTypeCode.ToBeAnnounced.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExposureType1Code> codesByName = new LinkedHashMap<>();

	protected ExposureType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureType1Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				trace_lazy = () -> ExposureTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureType1Code.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureType1Code.Commodities,
						com.tools20022.repository.codeset.ExposureType1Code.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureType1Code.CrossProduct, com.tools20022.repository.codeset.ExposureType1Code.CreditSupport,
						com.tools20022.repository.codeset.ExposureType1Code.CreditLine, com.tools20022.repository.codeset.ExposureType1Code.EquityOption, com.tools20022.repository.codeset.ExposureType1Code.EquitySwap,
						com.tools20022.repository.codeset.ExposureType1Code.ExoticOption, com.tools20022.repository.codeset.ExposureType1Code.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureType1Code.FixedIncome,
						com.tools20022.repository.codeset.ExposureType1Code.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureType1Code.ForeignExchange, com.tools20022.repository.codeset.ExposureType1Code.Futures,
						com.tools20022.repository.codeset.ExposureType1Code.Liquidity, com.tools20022.repository.codeset.ExposureType1Code.FXOption, com.tools20022.repository.codeset.ExposureType1Code.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureType1Code.CashSettlement, com.tools20022.repository.codeset.ExposureType1Code.RepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureType1Code.SecuritiesBuySellSellBuyBack, com.tools20022.repository.codeset.ExposureType1Code.SingleCurrencyIRSExotic,
						com.tools20022.repository.codeset.ExposureType1Code.SingleCurrencyIRS, com.tools20022.repository.codeset.ExposureType1Code.SecuritiesCrossProducts,
						com.tools20022.repository.codeset.ExposureType1Code.SecuritiesLendingAndBorrowing, com.tools20022.repository.codeset.ExposureType1Code.SecuredLoan, com.tools20022.repository.codeset.ExposureType1Code.Swaption,
						com.tools20022.repository.codeset.ExposureType1Code.TreasuryCorssProduct, com.tools20022.repository.codeset.ExposureType1Code.BondForward,
						com.tools20022.repository.codeset.ExposureType1Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.ExposureType1Code.ToBeAnnounced);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CrossCurrencyIRS.getCodeName().get(), CrossCurrencyIRS);
		codesByName.put(Commodities.getCodeName().get(), Commodities);
		codesByName.put(CreditDefaultSwap.getCodeName().get(), CreditDefaultSwap);
		codesByName.put(CrossProduct.getCodeName().get(), CrossProduct);
		codesByName.put(CreditSupport.getCodeName().get(), CreditSupport);
		codesByName.put(CreditLine.getCodeName().get(), CreditLine);
		codesByName.put(EquityOption.getCodeName().get(), EquityOption);
		codesByName.put(EquitySwap.getCodeName().get(), EquitySwap);
		codesByName.put(ExoticOption.getCodeName().get(), ExoticOption);
		codesByName.put(ExchangeTradedDerivatives.getCodeName().get(), ExchangeTradedDerivatives);
		codesByName.put(FixedIncome.getCodeName().get(), FixedIncome);
		codesByName.put(ForwardForeignExchange.getCodeName().get(), ForwardForeignExchange);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(Futures.getCodeName().get(), Futures);
		codesByName.put(Liquidity.getCodeName().get(), Liquidity);
		codesByName.put(FXOption.getCodeName().get(), FXOption);
		codesByName.put(OTCDerivatives.getCodeName().get(), OTCDerivatives);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(SecuritiesBuySellSellBuyBack.getCodeName().get(), SecuritiesBuySellSellBuyBack);
		codesByName.put(SingleCurrencyIRSExotic.getCodeName().get(), SingleCurrencyIRSExotic);
		codesByName.put(SingleCurrencyIRS.getCodeName().get(), SingleCurrencyIRS);
		codesByName.put(SecuritiesCrossProducts.getCodeName().get(), SecuritiesCrossProducts);
		codesByName.put(SecuritiesLendingAndBorrowing.getCodeName().get(), SecuritiesLendingAndBorrowing);
		codesByName.put(SecuredLoan.getCodeName().get(), SecuredLoan);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(TreasuryCorssProduct.getCodeName().get(), TreasuryCorssProduct);
		codesByName.put(BondForward.getCodeName().get(), BondForward);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(ToBeAnnounced.getCodeName().get(), ToBeAnnounced);
	}

	public static ExposureType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureType1Code[] values() {
		ExposureType1Code[] values = new ExposureType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureType1Code> {
		@Override
		public ExposureType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}