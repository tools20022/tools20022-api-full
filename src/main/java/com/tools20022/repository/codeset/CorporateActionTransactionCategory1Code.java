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
import com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transaction category to which the corporate action event type
 * belongs to for reporting purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#CashDividend
 * CorporateActionTransactionCategory1Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#UnitInvestmentTrustSecurity
 * CorporateActionTransactionCategory1Code.UnitInvestmentTrustSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#PassThrough
 * CorporateActionTransactionCategory1Code.PassThrough}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#CorporateBond
 * CorporateActionTransactionCategory1Code.CorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#MunicipalBond
 * CorporateActionTransactionCategory1Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#StockDistribution
 * CorporateActionTransactionCategory1Code.StockDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#OptionalDividend
 * CorporateActionTransactionCategory1Code.OptionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#ForeignRecordDateNotice
 * CorporateActionTransactionCategory1Code.ForeignRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#DividendReinvestment
 * CorporateActionTransactionCategory1Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#TaxExemptDividendService
 * CorporateActionTransactionCategory1Code.TaxExemptDividendService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#DirectRegistrationService
 * CorporateActionTransactionCategory1Code.DirectRegistrationService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#SpecialDistribution
 * CorporateActionTransactionCategory1Code.SpecialDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#Reorganisation
 * CorporateActionTransactionCategory1Code.Reorganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#RecapitalizationRecordDateNotice
 * CorporateActionTransactionCategory1Code.RecapitalizationRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#LiquidationRecordDateNotice
 * CorporateActionTransactionCategory1Code.LiquidationRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#SalesOfAssetsRecordDateNotice
 * CorporateActionTransactionCategory1Code.SalesOfAssetsRecordDateNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code#RedemptionsRecordDateNotice
 * CorporateActionTransactionCategory1Code.RedemptionsRecordDateNotice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategoryCode
 * CorporateActionTransactionCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionTransactionCategory1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transaction category to which the corporate action event type belongs to for reporting purposes."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionTransactionCategory1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code CashDividend = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitInvestmentTrustSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code UnitInvestmentTrustSecurity = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitInvestmentTrustSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.UnitInvestmentTrustSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassThrough"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code PassThrough = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassThrough";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.PassThrough.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code CorporateBond = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.CorporateBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code MunicipalBond = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.MunicipalBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code StockDistribution = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.StockDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code OptionalDividend = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.OptionalDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code ForeignRecordDateNotice = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignRecordDateNotice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.ForeignRecordDateNotice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code DividendReinvestment = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptDividendService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code TaxExemptDividendService = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptDividendService";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.TaxExemptDividendService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectRegistrationService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code DirectRegistrationService = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectRegistrationService";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.DirectRegistrationService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code SpecialDistribution = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.SpecialDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reorganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code Reorganisation = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reorganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.Reorganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code RecapitalizationRecordDateNotice = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationRecordDateNotice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.RecapitalizationRecordDateNotice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code LiquidationRecordDateNotice = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationRecordDateNotice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.LiquidationRecordDateNotice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalesOfAssetsRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code SalesOfAssetsRecordDateNotice = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalesOfAssetsRecordDateNotice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.SalesOfAssetsRecordDateNotice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionsRecordDateNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionTransactionCategory1Code RedemptionsRecordDateNotice = new CorporateActionTransactionCategory1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionsRecordDateNotice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.mmObject();
			codeName = CorporateActionTransactionCategoryCode.RedemptionsRecordDateNotice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionTransactionCategory1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionTransactionCategory1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TC05");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionTransactionCategory1Code";
				definition = "Specifies the transaction category to which the corporate action event type belongs to for reporting purposes.";
				trace_lazy = () -> CorporateActionTransactionCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.CashDividend, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.UnitInvestmentTrustSecurity,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.PassThrough, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.CorporateBond,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.MunicipalBond, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.StockDistribution,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.OptionalDividend, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.ForeignRecordDateNotice,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.DividendReinvestment, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.TaxExemptDividendService,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.DirectRegistrationService, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.SpecialDistribution,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.Reorganisation, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.RecapitalizationRecordDateNotice,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.LiquidationRecordDateNotice, com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.SalesOfAssetsRecordDateNotice,
						com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code.RedemptionsRecordDateNotice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(UnitInvestmentTrustSecurity.getCodeName().get(), UnitInvestmentTrustSecurity);
		codesByName.put(PassThrough.getCodeName().get(), PassThrough);
		codesByName.put(CorporateBond.getCodeName().get(), CorporateBond);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(StockDistribution.getCodeName().get(), StockDistribution);
		codesByName.put(OptionalDividend.getCodeName().get(), OptionalDividend);
		codesByName.put(ForeignRecordDateNotice.getCodeName().get(), ForeignRecordDateNotice);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(TaxExemptDividendService.getCodeName().get(), TaxExemptDividendService);
		codesByName.put(DirectRegistrationService.getCodeName().get(), DirectRegistrationService);
		codesByName.put(SpecialDistribution.getCodeName().get(), SpecialDistribution);
		codesByName.put(Reorganisation.getCodeName().get(), Reorganisation);
		codesByName.put(RecapitalizationRecordDateNotice.getCodeName().get(), RecapitalizationRecordDateNotice);
		codesByName.put(LiquidationRecordDateNotice.getCodeName().get(), LiquidationRecordDateNotice);
		codesByName.put(SalesOfAssetsRecordDateNotice.getCodeName().get(), SalesOfAssetsRecordDateNotice);
		codesByName.put(RedemptionsRecordDateNotice.getCodeName().get(), RedemptionsRecordDateNotice);
	}

	public static CorporateActionTransactionCategory1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionTransactionCategory1Code[] values() {
		CorporateActionTransactionCategory1Code[] values = new CorporateActionTransactionCategory1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionTransactionCategory1Code> {
		@Override
		public CorporateActionTransactionCategory1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionTransactionCategory1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}