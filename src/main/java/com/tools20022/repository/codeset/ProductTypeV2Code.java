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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmAgency
 * ProductTypeV2Code.mmAgency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmCommodity
 * ProductTypeV2Code.mmCommodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmCorporate
 * ProductTypeV2Code.mmCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmCurrency
 * ProductTypeV2Code.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmEquity
 * ProductTypeV2Code.mmEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmGovernment
 * ProductTypeV2Code.mmGovernment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmLoan
 * ProductTypeV2Code.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmMoneyMarket
 * ProductTypeV2Code.mmMoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmMortgage
 * ProductTypeV2Code.mmMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmMunicipal
 * ProductTypeV2Code.mmMunicipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmFinancing
 * ProductTypeV2Code.mmFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmProperty
 * ProductTypeV2Code.mmProperty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmSwap
 * ProductTypeV2Code.mmSwap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmOther
 * ProductTypeV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmInterestRate
 * ProductTypeV2Code.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmCredit
 * ProductTypeV2Code.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code#mmEmissionAllowance
 * ProductTypeV2Code.mmEmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType5Code
 * ProductType5Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
public class ProductTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies categories of instruments issued by federal agencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments issued by federal agencies."</li>
	 * </ul>
	 */
	public static final MMCode mmAgency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			definition = "Identifies categories of instruments issued by federal agencies.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Identifies categories of instruments that are commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
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
	 * definition} =
	 * "Identifies categories of instruments that are commodities."</li>
	 * </ul>
	 */
	public static final MMCode mmCommodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Identifies categories of instruments that are commodities.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Identifies categories of instruments issued by corporates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments issued by corporates."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate";
			definition = "Identifies categories of instruments issued by corporates.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Identifies categories of currency instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
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
	 * definition} = "Identifies categories of currency instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identifies categories of currency instruments.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Identifies the nature or type of an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
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
	 * definition} = "Identifies the nature or type of an equity."</li>
	 * </ul>
	 */
	public static final MMCode mmEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Identifies the nature or type of an equity.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Identifies categories of obligations issued by a government.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Government"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of obligations issued by a government."</li>
	 * </ul>
	 */
	public static final MMCode mmGovernment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Government";
			definition = "Identifies categories of obligations issued by a government.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "GOVE";
		}
	};
	/**
	 * Identifies categories of loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of loans."</li>
	 * </ul>
	 */
	public static final MMCode mmLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			definition = "Identifies categories of loans.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Identifies categories of short-term debt securities maturing in less than
	 * one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of short-term debt securities maturing in less than one year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Identifies categories of short-term debt securities maturing in less than one year.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "MOMA";
		}
	};
	/**
	 * Identifies categories of mortgage securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of mortgage securities."</li>
	 * </ul>
	 */
	public static final MMCode mmMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mortgage";
			definition = "Identifies categories of mortgage securities.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Identifies categories of securities issued by states and local
	 * governments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Municipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of securities issued by states and local governments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMunicipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Municipal";
			definition = "Identifies categories of securities issued by states and local governments.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "MUNI";
		}
	};
	/**
	 * Identifies categories of financing instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Financing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of financing instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financing";
			definition = "Identifies categories of financing instruments.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "FINA";
		}
	};
	/**
	 * The asset type is property.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Property"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The asset type is property."</li>
	 * </ul>
	 */
	public static final MMCode mmProperty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Property";
			definition = "The asset type is property.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * The asset type is a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
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
	 * definition} = "The asset type is a swap."</li>
	 * </ul>
	 */
	public static final MMCode mmSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "The asset type is a swap.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Other asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
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
	 * definition} = "Other asset type."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other asset type.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Identifies categories of instruments that are interest rates based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments that are interest rates based."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Identifies categories of instruments that are interest rates based.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Identifies categories of instruments that are credits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies categories of instruments that are credits."</li>
	 * </ul>
	 */
	public static final MMCode mmCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Identifies categories of instruments that are credits.";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Identifies categories of instruments related to Emission Allowance
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
	 * ProductTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies categories of instruments related to Emission Allowance"</li>
	 * </ul>
	 */
	public static final MMCode mmEmissionAllowance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			definition = "Identifies categories of instruments related to Emission Allowance";
			owner_lazy = () -> ProductTypeV2Code.mmObject();
			codeName = "EMAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductTypeV2Code";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductTypeV2Code.mmAgency, com.tools20022.repository.codeset.ProductTypeV2Code.mmCommodity, com.tools20022.repository.codeset.ProductTypeV2Code.mmCorporate,
						com.tools20022.repository.codeset.ProductTypeV2Code.mmCurrency, com.tools20022.repository.codeset.ProductTypeV2Code.mmEquity, com.tools20022.repository.codeset.ProductTypeV2Code.mmGovernment,
						com.tools20022.repository.codeset.ProductTypeV2Code.mmLoan, com.tools20022.repository.codeset.ProductTypeV2Code.mmMoneyMarket, com.tools20022.repository.codeset.ProductTypeV2Code.mmMortgage,
						com.tools20022.repository.codeset.ProductTypeV2Code.mmMunicipal, com.tools20022.repository.codeset.ProductTypeV2Code.mmFinancing, com.tools20022.repository.codeset.ProductTypeV2Code.mmProperty,
						com.tools20022.repository.codeset.ProductTypeV2Code.mmSwap, com.tools20022.repository.codeset.ProductTypeV2Code.mmOther, com.tools20022.repository.codeset.ProductTypeV2Code.mmInterestRate,
						com.tools20022.repository.codeset.ProductTypeV2Code.mmCredit, com.tools20022.repository.codeset.ProductTypeV2Code.mmEmissionAllowance);
				derivation_lazy = () -> Arrays.asList(ProductType5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}