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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transaction category to which the corporate action event type
 * belongs to for reporting purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmCashDividend
 * CorporateActionTransactionCategoryCode.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmUnitInvestmentTrustSecurity
 * CorporateActionTransactionCategoryCode.mmUnitInvestmentTrustSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmPassThrough
 * CorporateActionTransactionCategoryCode.mmPassThrough}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmCorporateBond
 * CorporateActionTransactionCategoryCode.mmCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmMunicipalBond
 * CorporateActionTransactionCategoryCode.mmMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmStockDistribution
 * CorporateActionTransactionCategoryCode.mmStockDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmOptionalDividend
 * CorporateActionTransactionCategoryCode.mmOptionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmForeignRecordDateNotice
 * CorporateActionTransactionCategoryCode.mmForeignRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmDividendReinvestment
 * CorporateActionTransactionCategoryCode.mmDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmTaxExemptDividendService
 * CorporateActionTransactionCategoryCode.mmTaxExemptDividendService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmDirectRegistrationService
 * CorporateActionTransactionCategoryCode.mmDirectRegistrationService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmSpecialDistribution
 * CorporateActionTransactionCategoryCode.mmSpecialDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmReorganisation
 * CorporateActionTransactionCategoryCode.mmReorganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmRecapitalizationRecordDateNotice
 * CorporateActionTransactionCategoryCode.mmRecapitalizationRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmLiquidationRecordDateNotice
 * CorporateActionTransactionCategoryCode.mmLiquidationRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmSalesOfAssetsRecordDateNotice
 * CorporateActionTransactionCategoryCode.mmSalesOfAssetsRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode#mmRedemptionsRecordDateNotice
 * CorporateActionTransactionCategoryCode.mmRedemptionsRecordDateNotice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
 * CorporateActionTransactionCategory1Code}</li>
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
 * <li>"TC05"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionTransactionCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transaction category to which the corporate action event type belongs to for reporting purposes."
 * </li>
 * </ul>
 */
public class CorporateActionTransactionCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reported event types belong to the cash dividend category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the cash dividend category."</li>
	 * </ul>
	 */
	public static final MMCode mmCashDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Reported event types belong to the cash dividend category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC05";
		}
	};
	/**
	 * Reported event types belong to the unit Investment trust security
	 * category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the unit Investment trust security category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnitInvestmentTrustSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustSecurity";
			definition = "Reported event types belong to the unit Investment trust security category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC10";
		}
	};
	/**
	 * Reported event types belong to the straight through processing category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassThrough"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the straight through processing category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPassThrough = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassThrough";
			definition = "Reported event types belong to the straight through processing category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC15";
		}
	};
	/**
	 * Reported event types belong to the corporate bond category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the corporate bond category."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			definition = "Reported event types belong to the corporate bond category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC20";
		}
	};
	/**
	 * Reported event types belong to the municipal bond category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC25"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the municipal bond category."</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Reported event types belong to the municipal bond category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC25";
		}
	};
	/**
	 * Reported event types belong to the stock distribution category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC30"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the stock distribution category."</li>
	 * </ul>
	 */
	public static final MMCode mmStockDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDistribution";
			definition = "Reported event types belong to the stock distribution category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC30";
		}
	};
	/**
	 * Reported event types belong to the optional dividend category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC35"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the optional dividend category."</li>
	 * </ul>
	 */
	public static final MMCode mmOptionalDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividend";
			definition = "Reported event types belong to the optional dividend category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC35";
		}
	};
	/**
	 * Reported event types belong to the foreign record date notice category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC38"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the foreign record date notice category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignRecordDateNotice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignRecordDateNotice";
			definition = "Reported event types belong to the foreign record date notice category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC38";
		}
	};
	/**
	 * Reported event types belong to the dividend reinvestment category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC40"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the dividend reinvestment category."</li>
	 * </ul>
	 */
	public static final MMCode mmDividendReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			definition = "Reported event types belong to the dividend reinvestment category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC40";
		}
	};
	/**
	 * Reported event types belong to the tax exempt dividend service category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC41"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptDividendService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the tax exempt dividend service category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxExemptDividendService = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptDividendService";
			definition = "Reported event types belong to the tax exempt dividend service category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC41";
		}
	};
	/**
	 * Reported event types belong to the direct registration service category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC42"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectRegistrationService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the direct registration service category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDirectRegistrationService = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectRegistrationService";
			definition = "Reported event types belong to the direct registration service category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC42";
		}
	};
	/**
	 * Reported event types belong to the special distribution category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC43"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the special distribution category."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDistribution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistribution";
			definition = "Reported event types belong to the special distribution category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC43";
		}
	};
	/**
	 * Reported event types belong to the reorganisation category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC45"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reorganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the reorganisation category."</li>
	 * </ul>
	 */
	public static final MMCode mmReorganisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reorganisation";
			definition = "Reported event types belong to the reorganisation category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC45";
		}
	};
	/**
	 * Reported event types belong to the recapitalization record date notice
	 * category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC46"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the recapitalization record date notice category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecapitalizationRecordDateNotice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationRecordDateNotice";
			definition = "Reported event types belong to the recapitalization record date notice category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC46";
		}
	};
	/**
	 * Reported event types belong to the liquidation record date notice
	 * category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC47"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the liquidation record date notice category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiquidationRecordDateNotice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationRecordDateNotice";
			definition = "Reported event types belong to the liquidation record date notice category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC47";
		}
	};
	/**
	 * Reported event types belong to the sales of assets record date notice
	 * category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC48"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalesOfAssetsRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the sales of assets record date notice category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSalesOfAssetsRecordDateNotice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalesOfAssetsRecordDateNotice";
			definition = "Reported event types belong to the sales of assets record date notice category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC48";
		}
	};
	/**
	 * Reported event types belong to the redemptions record date notice
	 * category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
	 * CorporateActionTransactionCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TC49"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionsRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported event types belong to the redemptions record date notice category."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionsRecordDateNotice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionsRecordDateNotice";
			definition = "Reported event types belong to the redemptions record date notice category.";
			owner_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
			codeName = "TC49";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TC05");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionTransactionCategoryCode";
				definition = "Specifies the transaction category to which the corporate action event type belongs to for reporting purposes.";
				code_lazy = () -> Arrays.asList(CorporateActionTransactionCategoryCode.mmCashDividend, CorporateActionTransactionCategoryCode.mmUnitInvestmentTrustSecurity, CorporateActionTransactionCategoryCode.mmPassThrough,
						CorporateActionTransactionCategoryCode.mmCorporateBond, CorporateActionTransactionCategoryCode.mmMunicipalBond, CorporateActionTransactionCategoryCode.mmStockDistribution,
						CorporateActionTransactionCategoryCode.mmOptionalDividend, CorporateActionTransactionCategoryCode.mmForeignRecordDateNotice, CorporateActionTransactionCategoryCode.mmDividendReinvestment,
						CorporateActionTransactionCategoryCode.mmTaxExemptDividendService, CorporateActionTransactionCategoryCode.mmDirectRegistrationService, CorporateActionTransactionCategoryCode.mmSpecialDistribution,
						CorporateActionTransactionCategoryCode.mmReorganisation, CorporateActionTransactionCategoryCode.mmRecapitalizationRecordDateNotice, CorporateActionTransactionCategoryCode.mmLiquidationRecordDateNotice,
						CorporateActionTransactionCategoryCode.mmSalesOfAssetsRecordDateNotice, CorporateActionTransactionCategoryCode.mmRedemptionsRecordDateNotice);
				derivation_lazy = () -> Arrays.asList(CorporateActionTransactionCategory1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}