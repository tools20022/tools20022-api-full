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
import com.tools20022.repository.codeset.QualifiedDividendTax1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the dividend as whole or in part qualifies for lower/
 * favourable tax rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code#FullyQualified
 * QualifiedDividendTax1Code.FullyQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code#PartlyQualified
 * QualifiedDividendTax1Code.PartlyQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code#NotQualified
 * QualifiedDividendTax1Code.NotQualified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code#Unknown
 * QualifiedDividendTax1Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTaxCode
 * QualifiedDividendTaxCode}</li>
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
 * "QualifiedDividendTax1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QualifiedDividendTax1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyQualified"</li>
	 * </ul>
	 */
	public static final QualifiedDividendTax1Code FullyQualified = new QualifiedDividendTax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyQualified";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTax1Code.mmObject();
			codeName = QualifiedDividendTaxCode.FullyQualified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartlyQualified"</li>
	 * </ul>
	 */
	public static final QualifiedDividendTax1Code PartlyQualified = new QualifiedDividendTax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartlyQualified";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTax1Code.mmObject();
			codeName = QualifiedDividendTaxCode.PartlyQualified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotQualified"</li>
	 * </ul>
	 */
	public static final QualifiedDividendTax1Code NotQualified = new QualifiedDividendTax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotQualified";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTax1Code.mmObject();
			codeName = QualifiedDividendTaxCode.NotQualified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final QualifiedDividendTax1Code Unknown = new QualifiedDividendTax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.QualifiedDividendTax1Code.mmObject();
			codeName = QualifiedDividendTaxCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QualifiedDividendTax1Code> codesByName = new LinkedHashMap<>();

	protected QualifiedDividendTax1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FQUD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedDividendTax1Code";
				definition = "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate.";
				trace_lazy = () -> QualifiedDividendTaxCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualifiedDividendTax1Code.FullyQualified, com.tools20022.repository.codeset.QualifiedDividendTax1Code.PartlyQualified,
						com.tools20022.repository.codeset.QualifiedDividendTax1Code.NotQualified, com.tools20022.repository.codeset.QualifiedDividendTax1Code.Unknown);
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

	public static QualifiedDividendTax1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QualifiedDividendTax1Code[] values() {
		QualifiedDividendTax1Code[] values = new QualifiedDividendTax1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QualifiedDividendTax1Code> {
		@Override
		public QualifiedDividendTax1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QualifiedDividendTax1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}