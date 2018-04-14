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
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the calculation of entitlements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#StockRateFC15
 * DTCEntitlementCalculationMethodCode.StockRateFC15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#CashRateFC17
 * DTCEntitlementCalculationMethodCode.CashRateFC17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#StockRateFC18
 * DTCEntitlementCalculationMethodCode.StockRateFC18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#StockRateXCashRateFC19
 * DTCEntitlementCalculationMethodCode.StockRateXCashRateFC19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#StockRateEnableBuyUpToNextWholeShareFC20
 * DTCEntitlementCalculationMethodCode.StockRateEnableBuyUpToNextWholeShareFC20}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode#SharesXStock
 * DTCEntitlementCalculationMethodCode.SharesXStock}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
 * DTCEntitlementCalculationMethod1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCEntitlementCalculationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the calculation of entitlements."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SR15"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCEntitlementCalculationMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Per individual account X share holding per account X Cash Rate divided by
	 * the Stock Rate = Whole Shares + CIL of Fractions Example: 100 shares X.50
	 * (Cash Rate) divided by $20.00 (Stock Rate)=2 whole shares and.500000
	 * fractions Fractional Entitlement: If the price is $15.00 per share, you
	 * would calculate.500000 X $15.00 = $7.50 for CIL.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SR15"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per individual account X share holding per account X Cash Rate divided by the Stock Rate = Whole Shares + CIL of Fractions Example: 100 shares X.50 (Cash Rate) divided by $20.00 (Stock Rate)=2 whole shares and.500000 fractions Fractional Entitlement: If the price is $15.00 per share, you would calculate.500000 X $15.00 = $7.50 for CIL."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode StockRateFC15 = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC15";
			definition = "Per individual account X share holding per account X Cash Rate divided by the Stock Rate = Whole Shares + CIL of Fractions Example: 100 shares X.50 (Cash Rate) divided by $20.00 (Stock Rate)=2 whole shares and.500000 fractions Fractional Entitlement: If the price is $15.00 per share, you would calculate.500000 X $15.00 = $7.50 for CIL.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "SR15";
		}
	};
	/**
	 * Per individual account X share holding per account X Cash Rate =
	 * entitlement Example: 100 shares X.50 (Cash Rate) = $50.00 in cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CR17"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateFC17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per individual account X share holding per account X Cash Rate = entitlement Example: 100 shares X.50 (Cash Rate) = $50.00 in cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode CashRateFC17 = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateFC17";
			definition = "Per individual account X share holding per account X Cash Rate = entitlement Example: 100 shares X.50 (Cash Rate) = $50.00 in cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "CR17";
		}
	};
	/**
	 * Per individual account X share holding per account X Stock Rate = whole
	 * shares + CIL of Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole
	 * shares and.500000 fractions Fractional Entitlement: If the CIL price is
	 * $10.00 per share, you would calculate.500000 X $10.00 = $5.00 for CIL.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SR18"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per individual account X share holding per account X Stock Rate = whole shares + CIL of Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions Fractional Entitlement: If the CIL price is $10.00 per share, you would calculate.500000 X $10.00 = $5.00 for CIL."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode StockRateFC18 = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC18";
			definition = "Per individual account X share holding per account X Stock Rate = whole shares + CIL of Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions Fractional Entitlement: If the CIL price is $10.00 per share, you would calculate.500000 X $10.00 = $5.00 for CIL.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "SR18";
		}
	};
	/**
	 * Per individual account X share holding per account X Stock Rate = whole
	 * shares + Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares
	 * and.500000 fractions. Cash Entitlement: If the CIL price is $10.00 per
	 * share, you would calculate 7.500000 shares X $10.00 = $75.00 in cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SC19"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateXCashRateFC19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per individual account X share holding per account X Stock Rate = whole shares + Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions. Cash Entitlement: If the CIL price is $10.00 per share, you would calculate 7.500000 shares X $10.00 = $75.00 in cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode StockRateXCashRateFC19 = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateXCashRateFC19";
			definition = "Per individual account X share holding per account X Stock Rate = whole shares + Fractions Example: 150 shares X 5% (Stock Rate) = 7 whole shares and.500000 fractions. Cash Entitlement: If the CIL price is $10.00 per share, you would calculate 7.500000 shares X $10.00 = $75.00 in cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "SC19";
		}
	};
	/**
	 * A) Per individual account X share holding per account X Stock Rate =
	 * Whole shares + CIL of Fractions (Note 1)Note 1- Then option is to buy
	 * fraction so as to round up to one (1) whole share B) Per individual
	 * account X (1 whole share-fractional issuable) = fractions to be bought X
	 * CIL Fraction Price= Cash to be charged to each individual account (Note
	 * 1) + 1 whole share to be added to the individual account (Note 2)Note 1-
	 * Appropriate cash adjustment decreasing a participants cash position will
	 * be transacted Note 2- Appropriate share adjustment increasing a
	 * participants share position will be transacted Special Note: The
	 * following two formulas relate to those situations whereby the option
	 * allows you to buy an additional fraction so as to round up to one (1)
	 * whole share. F/C 20-can be used for most fractions buy round ups. F/C
	 * 21-was once a mandatory fraction buy round up formula used by a agent.
	 * (The end result is the same if you use either F/C).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SB20"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateEnableBuyUpToNextWholeShareFC20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A) Per individual account X share holding per account X Stock Rate = Whole shares + CIL of Fractions (Note 1)Note 1- Then option is to buy fraction so as to round up to one (1) whole share B) Per individual account X (1 whole share-fractional issuable) = fractions to be bought X CIL Fraction Price= Cash to be charged to each individual account (Note 1) + 1 whole share to be added to the individual account (Note 2)Note 1- Appropriate cash adjustment decreasing a participants cash position will be transacted Note 2- Appropriate share adjustment increasing a participants share position will be transacted Special Note: The following two formulas relate to those situations whereby the option allows you to buy an additional fraction so as to round up to one (1) whole share. F/C 20-can be used for most fractions buy round ups. F/C 21-was once a mandatory fraction buy round up formula used by a agent. (The end result is the same if you use either F/C)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode StockRateEnableBuyUpToNextWholeShareFC20 = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateEnableBuyUpToNextWholeShareFC20";
			definition = "A) Per individual account X share holding per account X Stock Rate = Whole shares + CIL of Fractions (Note 1)Note 1- Then option is to buy fraction so as to round up to one (1) whole share B) Per individual account X (1 whole share-fractional issuable) = fractions to be bought X CIL Fraction Price= Cash to be charged to each individual account (Note 1) + 1 whole share to be added to the individual account (Note 2)Note 1- Appropriate cash adjustment decreasing a participants cash position will be transacted Note 2- Appropriate share adjustment increasing a participants share position will be transacted Special Note: The following two formulas relate to those situations whereby the option allows you to buy an additional fraction so as to round up to one (1) whole share. F/C 20-can be used for most fractions buy round ups. F/C 21-was once a mandatory fraction buy round up formula used by a agent. (The end result is the same if you use either F/C).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "SB20";
		}
	};
	/**
	 * A) Per individual account X share holding per account X Stock Rate =
	 * Whole shares + Fractional Issuable Note: This is a Mandatory Agent
	 * calculation for fractional round-up B) Per individual account X (1 whole
	 * share X round out price (announce in Cash Rate)-(Fractional Issuable X
	 * Stock Rate) = Cash to be charged to each individual account + 1 whole
	 * share to be added to each individual account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
	 * DTCEntitlementCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesXStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A) Per individual account X share holding per account X Stock Rate = Whole shares + Fractional Issuable Note: This is a Mandatory Agent calculation for fractional round-up B) Per individual account X (1 whole share X round out price (announce in Cash Rate)-(Fractional Issuable X Stock Rate) = Cash to be charged to each individual account + 1 whole share to be added to each individual account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCEntitlementCalculationMethodCode SharesXStock = new DTCEntitlementCalculationMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesXStock";
			definition = "A) Per individual account X share holding per account X Stock Rate = Whole shares + Fractional Issuable Note: This is a Mandatory Agent calculation for fractional round-up B) Per individual account X (1 whole share X round out price (announce in Cash Rate)-(Fractional Issuable X Stock Rate) = Cash to be charged to each individual account + 1 whole share to be added to each individual account.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.mmObject();
			codeName = "SHST";
		}
	};
	final static private LinkedHashMap<String, DTCEntitlementCalculationMethodCode> codesByName = new LinkedHashMap<>();

	protected DTCEntitlementCalculationMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SR15");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCEntitlementCalculationMethodCode";
				definition = "Specifies the type of the calculation of entitlements.";
				derivation_lazy = () -> Arrays.asList(DTCEntitlementCalculationMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.StockRateFC15, com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.CashRateFC17,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.StockRateFC18, com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.StockRateXCashRateFC19,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.StockRateEnableBuyUpToNextWholeShareFC20, com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode.SharesXStock);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockRateFC15.getCodeName().get(), StockRateFC15);
		codesByName.put(CashRateFC17.getCodeName().get(), CashRateFC17);
		codesByName.put(StockRateFC18.getCodeName().get(), StockRateFC18);
		codesByName.put(StockRateXCashRateFC19.getCodeName().get(), StockRateXCashRateFC19);
		codesByName.put(StockRateEnableBuyUpToNextWholeShareFC20.getCodeName().get(), StockRateEnableBuyUpToNextWholeShareFC20);
		codesByName.put(SharesXStock.getCodeName().get(), SharesXStock);
	}

	public static DTCEntitlementCalculationMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCEntitlementCalculationMethodCode[] values() {
		DTCEntitlementCalculationMethodCode[] values = new DTCEntitlementCalculationMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCEntitlementCalculationMethodCode> {
		@Override
		public DTCEntitlementCalculationMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCEntitlementCalculationMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}