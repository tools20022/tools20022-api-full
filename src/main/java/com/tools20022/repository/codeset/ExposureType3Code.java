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
import com.tools20022.repository.codeset.ExposureType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CrossCurrencyIRS
 * ExposureType3Code.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#Commodities
 * ExposureType3Code.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CreditDefaultSwap
 * ExposureType3Code.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CrossProduct
 * ExposureType3Code.CrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CreditSupport
 * ExposureType3Code.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CreditLine
 * ExposureType3Code.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#EquityOption
 * ExposureType3Code.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#EquitySwap
 * ExposureType3Code.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ExoticOption
 * ExposureType3Code.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ExchangeTradedDerivatives
 * ExposureType3Code.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#FixedIncome
 * ExposureType3Code.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ForwardForeignExchange
 * ExposureType3Code.ForwardForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ForeignExchange
 * ExposureType3Code.ForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType3Code#Futures
 * ExposureType3Code.Futures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#Liquidity
 * ExposureType3Code.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType3Code#FXOption
 * ExposureType3Code.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#OTCDerivatives
 * ExposureType3Code.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#CashSettlement
 * ExposureType3Code.CashSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType3Code#Repo
 * ExposureType3Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SecuritiesBuySellSellBuyBack
 * ExposureType3Code.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SingleCurrencyIRSExotic
 * ExposureType3Code.SingleCurrencyIRSExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SingleCurrencyIRS
 * ExposureType3Code.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SecuritiesCrossProducts
 * ExposureType3Code.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SecuritiesLendingAndBorrowing
 * ExposureType3Code.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#SecuredLoan
 * ExposureType3Code.SecuredLoan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType3Code#Swaption
 * ExposureType3Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#TreasuryCrossProduct
 * ExposureType3Code.TreasuryCrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#BondForward
 * ExposureType3Code.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ReverseRepurchaseAgreement
 * ExposureType3Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code#ToBeAnnounced
 * ExposureType3Code.ToBeAnnounced}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
 * ExposureTypeV2Code}</li>
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
 * "ExposureType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying business area/type of trade causing the collateral movement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CrossCurrencyIRS = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CrossCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodities"</li>
	 * </ul>
	 */
	public static final ExposureType3Code Commodities = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.Commodities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwap"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CreditDefaultSwap = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CreditDefaultSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossProduct"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CrossProduct = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CrossProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditSupport"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CreditSupport = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CreditSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CreditLine = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CreditLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityOption"</li>
	 * </ul>
	 */
	public static final ExposureType3Code EquityOption = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.EquityOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquitySwap"</li>
	 * </ul>
	 */
	public static final ExposureType3Code EquitySwap = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.EquitySwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExoticOption"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ExoticOption = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ExoticOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ExchangeTradedDerivatives = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ExchangeTradedDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedIncome"</li>
	 * </ul>
	 */
	public static final ExposureType3Code FixedIncome = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.FixedIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ForwardForeignExchange = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ForwardForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ForeignExchange = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final ExposureType3Code Futures = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * </ul>
	 */
	public static final ExposureType3Code Liquidity = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.Liquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXOption"</li>
	 * </ul>
	 */
	public static final ExposureType3Code FXOption = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.FXOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType3Code OTCDerivatives = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.OTCDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final ExposureType3Code CashSettlement = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.CashSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * </ul>
	 */
	public static final ExposureType3Code Repo = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuySellSellBuyBack"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SecuritiesBuySellSellBuyBack = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SecuritiesBuySellSellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRSExotic"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SingleCurrencyIRSExotic = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SingleCurrencyIRSExotic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SingleCurrencyIRS = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SingleCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCrossProducts"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SecuritiesCrossProducts = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SecuritiesCrossProducts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingAndBorrowing"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SecuritiesLendingAndBorrowing = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SecuritiesLendingAndBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredLoan"</li>
	 * </ul>
	 */
	public static final ExposureType3Code SecuredLoan = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.SecuredLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * </ul>
	 */
	public static final ExposureType3Code Swaption = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.Swaption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCrossProduct"</li>
	 * </ul>
	 */
	public static final ExposureType3Code TreasuryCrossProduct = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCrossProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.TreasuryCrossProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondForward"</li>
	 * </ul>
	 */
	public static final ExposureType3Code BondForward = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.BondForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ReverseRepurchaseAgreement = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType3Code
	 * ExposureType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnounced"</li>
	 * </ul>
	 */
	public static final ExposureType3Code ToBeAnnounced = new ExposureType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType3Code.mmObject();
			codeName = ExposureTypeV2Code.ToBeAnnounced.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExposureType3Code> codesByName = new LinkedHashMap<>();

	protected ExposureType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureType3Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				trace_lazy = () -> ExposureTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureType3Code.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureType3Code.Commodities,
						com.tools20022.repository.codeset.ExposureType3Code.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureType3Code.CrossProduct, com.tools20022.repository.codeset.ExposureType3Code.CreditSupport,
						com.tools20022.repository.codeset.ExposureType3Code.CreditLine, com.tools20022.repository.codeset.ExposureType3Code.EquityOption, com.tools20022.repository.codeset.ExposureType3Code.EquitySwap,
						com.tools20022.repository.codeset.ExposureType3Code.ExoticOption, com.tools20022.repository.codeset.ExposureType3Code.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureType3Code.FixedIncome,
						com.tools20022.repository.codeset.ExposureType3Code.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureType3Code.ForeignExchange, com.tools20022.repository.codeset.ExposureType3Code.Futures,
						com.tools20022.repository.codeset.ExposureType3Code.Liquidity, com.tools20022.repository.codeset.ExposureType3Code.FXOption, com.tools20022.repository.codeset.ExposureType3Code.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureType3Code.CashSettlement, com.tools20022.repository.codeset.ExposureType3Code.Repo, com.tools20022.repository.codeset.ExposureType3Code.SecuritiesBuySellSellBuyBack,
						com.tools20022.repository.codeset.ExposureType3Code.SingleCurrencyIRSExotic, com.tools20022.repository.codeset.ExposureType3Code.SingleCurrencyIRS,
						com.tools20022.repository.codeset.ExposureType3Code.SecuritiesCrossProducts, com.tools20022.repository.codeset.ExposureType3Code.SecuritiesLendingAndBorrowing,
						com.tools20022.repository.codeset.ExposureType3Code.SecuredLoan, com.tools20022.repository.codeset.ExposureType3Code.Swaption, com.tools20022.repository.codeset.ExposureType3Code.TreasuryCrossProduct,
						com.tools20022.repository.codeset.ExposureType3Code.BondForward, com.tools20022.repository.codeset.ExposureType3Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.ExposureType3Code.ToBeAnnounced);
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
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(SecuritiesBuySellSellBuyBack.getCodeName().get(), SecuritiesBuySellSellBuyBack);
		codesByName.put(SingleCurrencyIRSExotic.getCodeName().get(), SingleCurrencyIRSExotic);
		codesByName.put(SingleCurrencyIRS.getCodeName().get(), SingleCurrencyIRS);
		codesByName.put(SecuritiesCrossProducts.getCodeName().get(), SecuritiesCrossProducts);
		codesByName.put(SecuritiesLendingAndBorrowing.getCodeName().get(), SecuritiesLendingAndBorrowing);
		codesByName.put(SecuredLoan.getCodeName().get(), SecuredLoan);
		codesByName.put(Swaption.getCodeName().get(), Swaption);
		codesByName.put(TreasuryCrossProduct.getCodeName().get(), TreasuryCrossProduct);
		codesByName.put(BondForward.getCodeName().get(), BondForward);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(ToBeAnnounced.getCodeName().get(), ToBeAnnounced);
	}

	public static ExposureType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureType3Code[] values() {
		ExposureType3Code[] values = new ExposureType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureType3Code> {
		@Override
		public ExposureType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}