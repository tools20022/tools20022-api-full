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
import com.tools20022.repository.codeset.TypeOfIdentification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of alternate identification which can be used to give an
 * alternate identification of the party identified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#AlienRegistrationNumber
 * TypeOfIdentification1Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#PassportNumber
 * TypeOfIdentification1Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#TaxExemptIdentificationNumber
 * TypeOfIdentification1Code.TaxExemptIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#CorporateIdentification
 * TypeOfIdentification1Code.CorporateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#DriverLicenseNumber
 * TypeOfIdentification1Code.DriverLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#ForeignInvestmentIdentityNumber
 * TypeOfIdentification1Code.ForeignInvestmentIdentityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code#TaxIdentificationNumber
 * TypeOfIdentification1Code.TaxIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
 * TypeOfIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ARNU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfIdentification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfIdentification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code AlienRegistrationNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.AlienRegistrationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code PassportNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptIdentificationNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code TaxExemptIdentificationNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.TaxExemptIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateIdentification"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code CorporateIdentification = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.CorporateIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverLicenseNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code DriverLicenseNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.DriverLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignInvestmentIdentityNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code ForeignInvestmentIdentityNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.ForeignInvestmentIdentityNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentification1Code
	 * TypeOfIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * </ul>
	 */
	public static final TypeOfIdentification1Code TaxIdentificationNumber = new TypeOfIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentification1Code.mmObject();
			codeName = TypeOfIdentificationCode.TaxIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfIdentification1Code> codesByName = new LinkedHashMap<>();

	protected TypeOfIdentification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ARNU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfIdentification1Code";
				definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
				trace_lazy = () -> TypeOfIdentificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfIdentification1Code.AlienRegistrationNumber, com.tools20022.repository.codeset.TypeOfIdentification1Code.PassportNumber,
						com.tools20022.repository.codeset.TypeOfIdentification1Code.TaxExemptIdentificationNumber, com.tools20022.repository.codeset.TypeOfIdentification1Code.CorporateIdentification,
						com.tools20022.repository.codeset.TypeOfIdentification1Code.DriverLicenseNumber, com.tools20022.repository.codeset.TypeOfIdentification1Code.ForeignInvestmentIdentityNumber,
						com.tools20022.repository.codeset.TypeOfIdentification1Code.TaxIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(TaxExemptIdentificationNumber.getCodeName().get(), TaxExemptIdentificationNumber);
		codesByName.put(CorporateIdentification.getCodeName().get(), CorporateIdentification);
		codesByName.put(DriverLicenseNumber.getCodeName().get(), DriverLicenseNumber);
		codesByName.put(ForeignInvestmentIdentityNumber.getCodeName().get(), ForeignInvestmentIdentityNumber);
		codesByName.put(TaxIdentificationNumber.getCodeName().get(), TaxIdentificationNumber);
	}

	public static TypeOfIdentification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfIdentification1Code[] values() {
		TypeOfIdentification1Code[] values = new TypeOfIdentification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfIdentification1Code> {
		@Override
		public TypeOfIdentification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfIdentification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}