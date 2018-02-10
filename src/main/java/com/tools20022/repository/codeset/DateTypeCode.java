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
import com.tools20022.repository.codeset.DateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Ongoing basis, which indicates that the date is determined by "ongoing basis"
 * process, for example "au fil de l'eau".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DateTypeCode#Open
 * DateTypeCode.Open}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateTypeCode#Unknown
 * DateTypeCode.Unknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateTypeCode#Ongoing
 * DateTypeCode.Ongoing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateTypeCode#Various
 * DateTypeCode.Various}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType3Code
 * DateType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType6Code
 * DateType6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType8Code
 * DateType8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType7Code
 * DateType7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType1Code
 * DateType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType5Code
 * DateType5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType4Code
 * DateType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DateType2Code
 * DateType2Code}</li>
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
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ongoing basis, which indicates that the date is determined by \"ongoing basis\" process, for example \"au fil de l'eau\"."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Open-dated, which indicates that the date has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DateTypeCode DateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Open-dated, which indicates that the date has not been established."</li>
	 * </ul>
	 */
	public static final DateTypeCode Open = new DateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Open-dated, which indicates that the date has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.DateTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Date is unknown by the sender or has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DateTypeCode DateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date is unknown by the sender or has not been established."</li>
	 * </ul>
	 */
	public static final DateTypeCode Unknown = new DateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Date is unknown by the sender or has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.DateTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Ongoing basis, which indicates that the date is determined by
	 * "ongoing basis" process, for example "au fil de l'eau".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DateTypeCode DateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ongoing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ongoing basis, which indicates that the date is determined by \"ongoing basis\" process, for example \"au fil de l'eau\"."
	 * </li>
	 * </ul>
	 */
	public static final DateTypeCode Ongoing = new DateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ongoing";
			definition = "Ongoing basis, which indicates that the date is determined by \"ongoing basis\" process, for example \"au fil de l'eau\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DateTypeCode.mmObject();
			codeName = "ONGO";
		}
	};
	/**
	 * Partial trades have occurred over a period of two or more days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DateTypeCode DateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Various"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial trades have occurred over a period of two or more days."</li>
	 * </ul>
	 */
	public static final DateTypeCode Various = new DateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Various";
			definition = "Partial trades have occurred over a period of two or more days.";
			owner_lazy = () -> com.tools20022.repository.codeset.DateTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	final static private LinkedHashMap<String, DateTypeCode> codesByName = new LinkedHashMap<>();

	protected DateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateTypeCode";
				definition = "Ongoing basis, which indicates that the date is determined by \"ongoing basis\" process, for example \"au fil de l'eau\".";
				derivation_lazy = () -> Arrays.asList(DateType3Code.mmObject(), DateType6Code.mmObject(), DateType8Code.mmObject(), DateType7Code.mmObject(), DateType1Code.mmObject(), DateType5Code.mmObject(), DateType4Code.mmObject(),
						DateType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DateTypeCode.Open, com.tools20022.repository.codeset.DateTypeCode.Unknown, com.tools20022.repository.codeset.DateTypeCode.Ongoing,
						com.tools20022.repository.codeset.DateTypeCode.Various);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(Ongoing.getCodeName().get(), Ongoing);
		codesByName.put(Various.getCodeName().get(), Various);
	}

	public static DateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DateTypeCode[] values() {
		DateTypeCode[] values = new DateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DateTypeCode> {
		@Override
		public DateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}