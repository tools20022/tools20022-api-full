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
import com.tools20022.repository.codeset.UnderlyingTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Basket
 * UnderlyingTypeV2Code.Basket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Bond
 * UnderlyingTypeV2Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#BondFuture
 * UnderlyingTypeV2Code.BondFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Commodity
 * UnderlyingTypeV2Code.Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Currency
 * UnderlyingTypeV2Code.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#DividendIndex
 * UnderlyingTypeV2Code.DividendIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Equity
 * UnderlyingTypeV2Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#ExchangeTradedFund
 * UnderlyingTypeV2Code.ExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Future
 * UnderlyingTypeV2Code.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#FutureOnEquity
 * UnderlyingTypeV2Code.FutureOnEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Index
 * UnderlyingTypeV2Code.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Interest
 * UnderlyingTypeV2Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Option
 * UnderlyingTypeV2Code.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#OptionOnEquity
 * UnderlyingTypeV2Code.OptionOnEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Other
 * UnderlyingTypeV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#PreciousMetal
 * UnderlyingTypeV2Code.PreciousMetal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Share
 * UnderlyingTypeV2Code.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#StockDividend
 * UnderlyingTypeV2Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#StockIndex
 * UnderlyingTypeV2Code.StockIndex}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#Swap
 * UnderlyingTypeV2Code.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#VolatilityIndex
 * UnderlyingTypeV2Code.VolatilityIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code#InterestRateFutureFRA
 * UnderlyingTypeV2Code.InterestRateFutureFRA}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingEquityType3Code
 * UnderlyingEquityType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
 * UnderlyingEquityType4Code}</li>
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
 * "UnderlyingTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying is a basket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a basket."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Basket = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			definition = "Underlying is a basket.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * Underlying is a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Bond = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Underlying is a bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Underlying is a bond future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond future."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code BondFuture = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondFuture";
			definition = "Underlying is a bond future.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "BNDF";
		}
	};
	/**
	 * Underlying is a commodity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a commodity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Commodity = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Underlying is a commodity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Underlying is a currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a currency."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Currency = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Underlying is a currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Underlying is a dividend index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a dividend index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code DividendIndex = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			definition = "Underlying is a dividend index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Underlying is an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Equity = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Underlying is an equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Underlying is an exchange traded fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an exchange traded fund."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code ExchangeTradedFund = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Underlying is an exchange traded fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "ETFT";
		}
	};
	/**
	 * Underlying is a future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a future."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Future = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Underlying is a future.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Underlying is a future on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a future on equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code FutureOnEquity = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOnEquity";
			definition = "Underlying is a future on equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "FTEQ";
		}
	};
	/**
	 * Underlying is an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Index = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Underlying is an index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * Underlying is interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is interest."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Interest = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Underlying is interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Underlying is an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an option."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Option = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Underlying is an option.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Underlying is an option on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an option on equity."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code OptionOnEquity = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOnEquity";
			definition = "Underlying is an option on equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "OPEQ";
		}
	};
	/**
	 * Underlying is of other type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is of other type."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Other = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Underlying is of other type.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Underlying is precious metal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreciousMetal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is precious metal."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code PreciousMetal = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreciousMetal";
			definition = "Underlying is precious metal.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "PRME";
		}
	};
	/**
	 * Underlying is a share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a share."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Share = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Underlying is a share.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Underlying is a stock dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock dividend."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code StockDividend = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Underlying is a stock dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Underlying is a stock index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code StockIndex = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			definition = "Underlying is a stock index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "STIX";
		}
	};
	/**
	 * Underlying is a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a swap."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code Swap = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Underlying is a swap.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Underlying is a volatility index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a volatility index."</li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code VolatilityIndex = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			definition = "Underlying is a volatility index.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "VOLI";
		}
	};
	/**
	 * Underlying is an interest rate future or a forward rate agreement (FRA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
	 * UnderlyingTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateFutureFRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying is an interest rate future or a forward rate agreement (FRA)."
	 * </li>
	 * </ul>
	 */
	public static final UnderlyingTypeV2Code InterestRateFutureFRA = new UnderlyingTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateFutureFRA";
			definition = "Underlying is an interest rate future or a forward rate agreement (FRA).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingTypeV2Code.mmObject();
			codeName = "IFUT";
		}
	};
	final static private LinkedHashMap<String, UnderlyingTypeV2Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTypeV2Code";
				definition = "Specifies the underlying financial instrument.";
				derivation_lazy = () -> Arrays.asList(UnderlyingEquityType3Code.mmObject(), UnderlyingEquityType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingTypeV2Code.Basket, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Bond, com.tools20022.repository.codeset.UnderlyingTypeV2Code.BondFuture,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.Commodity, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Currency, com.tools20022.repository.codeset.UnderlyingTypeV2Code.DividendIndex,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.Equity, com.tools20022.repository.codeset.UnderlyingTypeV2Code.ExchangeTradedFund, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Future,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.FutureOnEquity, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Index, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Interest,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.Option, com.tools20022.repository.codeset.UnderlyingTypeV2Code.OptionOnEquity, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Other,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.PreciousMetal, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Share, com.tools20022.repository.codeset.UnderlyingTypeV2Code.StockDividend,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.StockIndex, com.tools20022.repository.codeset.UnderlyingTypeV2Code.Swap, com.tools20022.repository.codeset.UnderlyingTypeV2Code.VolatilityIndex,
						com.tools20022.repository.codeset.UnderlyingTypeV2Code.InterestRateFutureFRA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(BondFuture.getCodeName().get(), BondFuture);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Currency.getCodeName().get(), Currency);
		codesByName.put(DividendIndex.getCodeName().get(), DividendIndex);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(ExchangeTradedFund.getCodeName().get(), ExchangeTradedFund);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(FutureOnEquity.getCodeName().get(), FutureOnEquity);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(OptionOnEquity.getCodeName().get(), OptionOnEquity);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PreciousMetal.getCodeName().get(), PreciousMetal);
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(StockIndex.getCodeName().get(), StockIndex);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(VolatilityIndex.getCodeName().get(), VolatilityIndex);
		codesByName.put(InterestRateFutureFRA.getCodeName().get(), InterestRateFutureFRA);
	}

	public static UnderlyingTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingTypeV2Code[] values() {
		UnderlyingTypeV2Code[] values = new UnderlyingTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingTypeV2Code> {
		@Override
		public UnderlyingTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}