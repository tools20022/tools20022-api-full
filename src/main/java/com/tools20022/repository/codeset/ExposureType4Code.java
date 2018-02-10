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
import com.tools20022.repository.codeset.ExposureType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#BondForward
 * ExposureType4Code.BondForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CashSettlement
 * ExposureType4Code.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CCPCollateral
 * ExposureType4Code.CCPCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#Commodities
 * ExposureType4Code.Commodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CreditDefaultSwap
 * ExposureType4Code.CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CreditLine
 * ExposureType4Code.CreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CreditSupport
 * ExposureType4Code.CreditSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CrossCurrencyIRS
 * ExposureType4Code.CrossCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#CrossProduct
 * ExposureType4Code.CrossProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#EquityOption
 * ExposureType4Code.EquityOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ExchangeTradedDerivatives
 * ExposureType4Code.ExchangeTradedDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#EquitySwap
 * ExposureType4Code.EquitySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ExoticOption
 * ExposureType4Code.ExoticOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#FixedIncome
 * ExposureType4Code.FixedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ForeignExchange
 * ExposureType4Code.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ForwardForeignExchange
 * ExposureType4Code.ForwardForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType4Code#Futures
 * ExposureType4Code.Futures}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType4Code#FXOption
 * ExposureType4Code.FXOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#Liquidity
 * ExposureType4Code.Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#OTCDerivatives
 * ExposureType4Code.OTCDerivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#RepurchaseAgreement
 * ExposureType4Code.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ReverseRepurchaseAgreement
 * ExposureType4Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SecuredLoan
 * ExposureType4Code.SecuredLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SecuritiesBuySellSellBuyBack
 * ExposureType4Code.SecuritiesBuySellSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SecuritiesCrossProducts
 * ExposureType4Code.SecuritiesCrossProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SecuritiesLendingAndBorrowing
 * ExposureType4Code.SecuritiesLendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ShortSell
 * ExposureType4Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SingleCurrencyIRS
 * ExposureType4Code.SingleCurrencyIRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#SingleCurrencyIRSExotic
 * ExposureType4Code.SingleCurrencyIRSExotic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ExposureType4Code#Swaption
 * ExposureType4Code.Swaption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#ToBeAnnounced
 * ExposureType4Code.ToBeAnnounced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code#TreasuryCorssProduct
 * ExposureType4Code.TreasuryCorssProduct}</li>
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
 * "ExposureType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying business area/type of trade causing the collateral movement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExposureType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondForward"</li>
	 * </ul>
	 */
	public static final ExposureType4Code BondForward = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.BondForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CashSettlement = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CashSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPCollateral"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CCPCollateral = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CCPCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodities"</li>
	 * </ul>
	 */
	public static final ExposureType4Code Commodities = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.Commodities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwap"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CreditDefaultSwap = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CreditDefaultSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CreditLine = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CreditLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditSupport"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CreditSupport = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CreditSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CrossCurrencyIRS = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CrossCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossProduct"</li>
	 * </ul>
	 */
	public static final ExposureType4Code CrossProduct = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.CrossProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityOption"</li>
	 * </ul>
	 */
	public static final ExposureType4Code EquityOption = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.EquityOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ExchangeTradedDerivatives = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ExchangeTradedDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquitySwap"</li>
	 * </ul>
	 */
	public static final ExposureType4Code EquitySwap = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.EquitySwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExoticOption"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ExoticOption = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ExoticOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedIncome"</li>
	 * </ul>
	 */
	public static final ExposureType4Code FixedIncome = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.FixedIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ForeignExchange = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardForeignExchange"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ForwardForeignExchange = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ForwardForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final ExposureType4Code Futures = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXOption"</li>
	 * </ul>
	 */
	public static final ExposureType4Code FXOption = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.FXOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * </ul>
	 */
	public static final ExposureType4Code Liquidity = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.Liquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OTCDerivatives"</li>
	 * </ul>
	 */
	public static final ExposureType4Code OTCDerivatives = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.OTCDerivatives.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType4Code RepurchaseAgreement = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.RepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ReverseRepurchaseAgreement = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredLoan"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SecuredLoan = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SecuredLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuySellSellBuyBack"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SecuritiesBuySellSellBuyBack = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesBuySellSellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCrossProducts"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SecuritiesCrossProducts = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesCrossProducts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingAndBorrowing"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SecuritiesLendingAndBorrowing = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SecuritiesLendingAndBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ShortSell = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ShortSell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRS"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SingleCurrencyIRS = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCurrencyIRSExotic"</li>
	 * </ul>
	 */
	public static final ExposureType4Code SingleCurrencyIRSExotic = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.SingleCurrencyIRSExotic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swaption"</li>
	 * </ul>
	 */
	public static final ExposureType4Code Swaption = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.Swaption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnounced"</li>
	 * </ul>
	 */
	public static final ExposureType4Code ToBeAnnounced = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.ToBeAnnounced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType4Code
	 * ExposureType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryCorssProduct"</li>
	 * </ul>
	 */
	public static final ExposureType4Code TreasuryCorssProduct = new ExposureType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCorssProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.ExposureType4Code.mmObject();
			codeName = ExposureTypeCode.TreasuryCorssProduct.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExposureType4Code> codesByName = new LinkedHashMap<>();

	protected ExposureType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureType4Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				trace_lazy = () -> ExposureTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureType4Code.BondForward, com.tools20022.repository.codeset.ExposureType4Code.CashSettlement,
						com.tools20022.repository.codeset.ExposureType4Code.CCPCollateral, com.tools20022.repository.codeset.ExposureType4Code.Commodities, com.tools20022.repository.codeset.ExposureType4Code.CreditDefaultSwap,
						com.tools20022.repository.codeset.ExposureType4Code.CreditLine, com.tools20022.repository.codeset.ExposureType4Code.CreditSupport, com.tools20022.repository.codeset.ExposureType4Code.CrossCurrencyIRS,
						com.tools20022.repository.codeset.ExposureType4Code.CrossProduct, com.tools20022.repository.codeset.ExposureType4Code.EquityOption, com.tools20022.repository.codeset.ExposureType4Code.ExchangeTradedDerivatives,
						com.tools20022.repository.codeset.ExposureType4Code.EquitySwap, com.tools20022.repository.codeset.ExposureType4Code.ExoticOption, com.tools20022.repository.codeset.ExposureType4Code.FixedIncome,
						com.tools20022.repository.codeset.ExposureType4Code.ForeignExchange, com.tools20022.repository.codeset.ExposureType4Code.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureType4Code.Futures,
						com.tools20022.repository.codeset.ExposureType4Code.FXOption, com.tools20022.repository.codeset.ExposureType4Code.Liquidity, com.tools20022.repository.codeset.ExposureType4Code.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureType4Code.RepurchaseAgreement, com.tools20022.repository.codeset.ExposureType4Code.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureType4Code.SecuredLoan, com.tools20022.repository.codeset.ExposureType4Code.SecuritiesBuySellSellBuyBack,
						com.tools20022.repository.codeset.ExposureType4Code.SecuritiesCrossProducts, com.tools20022.repository.codeset.ExposureType4Code.SecuritiesLendingAndBorrowing,
						com.tools20022.repository.codeset.ExposureType4Code.ShortSell, com.tools20022.repository.codeset.ExposureType4Code.SingleCurrencyIRS, com.tools20022.repository.codeset.ExposureType4Code.SingleCurrencyIRSExotic,
						com.tools20022.repository.codeset.ExposureType4Code.Swaption, com.tools20022.repository.codeset.ExposureType4Code.ToBeAnnounced, com.tools20022.repository.codeset.ExposureType4Code.TreasuryCorssProduct);
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
		codesByName.put(EquityOption.getCodeName().get(), EquityOption);
		codesByName.put(ExchangeTradedDerivatives.getCodeName().get(), ExchangeTradedDerivatives);
		codesByName.put(EquitySwap.getCodeName().get(), EquitySwap);
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
		codesByName.put(TreasuryCorssProduct.getCodeName().get(), TreasuryCorssProduct);
	}

	public static ExposureType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExposureType4Code[] values() {
		ExposureType4Code[] values = new ExposureType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExposureType4Code> {
		@Override
		public ExposureType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExposureType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}