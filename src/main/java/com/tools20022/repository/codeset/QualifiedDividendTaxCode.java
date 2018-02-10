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
import com.tools20022.repository.codeset.QualifiedDividendTaxCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the dividend as a whole or in part qualifies for
 * lower/favourable tax rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode#FullyQualified
 * QualifiedDividendTaxCode.FullyQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode#PartlyQualified
 * QualifiedDividendTaxCode.PartlyQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode#NotQualified
 * QualifiedDividendTaxCode.NotQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode#Unknown
 * QualifiedDividendTaxCode.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
 * QualifiedDividendTax1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FQUD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QualifiedDividendTaxCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the dividend as a whole or in part qualifies for lower/favourable tax rate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QualifiedDividendTaxCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend income is potentially qualified (for instance common or
	 * preferred stock dividends, income distribution by mutual funds).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode
	 * QualifiedDividendTaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FQUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend income is potentially qualified (for instance common or preferred stock dividends, income distribution by mutual funds)."
	 * </li>
	 * </ul>
	 */
	public static final QualifiedDividendTaxCode FullyQualified = new QualifiedDividendTaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyQualified";
			definition = "Dividend income is potentially qualified (for instance common or preferred stock dividends, income distribution by mutual funds).";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTaxCode.mmObject();
			codeName = "FQUD";
		}
	};
	/**
	 * Part of dividend income is potentially qualified (for instance income
	 * form a mutual fund which holds both stocks and bonds).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode
	 * QualifiedDividendTaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PQUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartlyQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of dividend income is potentially qualified (for instance income form a mutual fund which holds both stocks and bonds)."
	 * </li>
	 * </ul>
	 */
	public static final QualifiedDividendTaxCode PartlyQualified = new QualifiedDividendTaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartlyQualified";
			definition = "Part of dividend income is potentially qualified (for instance income form a mutual fund which holds both stocks and bonds).";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTaxCode.mmObject();
			codeName = "PQUD";
		}
	};
	/**
	 * Dividend is not qualified (for instance UIT dividends, REIT dividends).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode
	 * QualifiedDividendTaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NQUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend is not qualified (for instance UIT dividends, REIT dividends)."
	 * </li>
	 * </ul>
	 */
	public static final QualifiedDividendTaxCode NotQualified = new QualifiedDividendTaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotQualified";
			definition = "Dividend is not qualified (for instance UIT dividends, REIT dividends).";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTaxCode.mmObject();
			codeName = "NQUD";
		}
	};
	/**
	 * Qualified dividend tax status is unknown (for instance if dividend tax
	 * status information is unavailable at the time of the dividend update, it
	 * will be provided when new information is received).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode
	 * QualifiedDividendTaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualified dividend tax status is unknown (for instance if dividend tax status information is unavailable at the time of the dividend update, it will be provided when new information is received)."
	 * </li>
	 * </ul>
	 */
	public static final QualifiedDividendTaxCode Unknown = new QualifiedDividendTaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Qualified dividend tax status is unknown (for instance if dividend tax status information is unavailable at the time of the dividend update, it will be provided when new information is received).";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTaxCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, QualifiedDividendTaxCode> codesByName = new LinkedHashMap<>();

	protected QualifiedDividendTaxCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FQUD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedDividendTaxCode";
				definition = "Indicates whether the dividend as a whole or in part qualifies for lower/favourable tax rate.";
				derivation_lazy = () -> Arrays.asList(QualifiedDividendTax1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualifiedDividendTaxCode.FullyQualified, com.tools20022.repository.codeset.QualifiedDividendTaxCode.PartlyQualified,
						com.tools20022.repository.codeset.QualifiedDividendTaxCode.NotQualified, com.tools20022.repository.codeset.QualifiedDividendTaxCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FullyQualified.getCodeName().get(), FullyQualified);
		codesByName.put(PartlyQualified.getCodeName().get(), PartlyQualified);
		codesByName.put(NotQualified.getCodeName().get(), NotQualified);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static QualifiedDividendTaxCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QualifiedDividendTaxCode[] values() {
		QualifiedDividendTaxCode[] values = new QualifiedDividendTaxCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QualifiedDividendTaxCode> {
		@Override
		public QualifiedDividendTaxCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QualifiedDividendTaxCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}