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
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of certification completion required for a beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code#CertificationNotRequired
 * BeneficiaryCertificationCompletion1Code.CertificationNotRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code#ElectronicCertification
 * BeneficiaryCertificationCompletion1Code.ElectronicCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code#PhysicalCertification
 * BeneficiaryCertificationCompletion1Code.PhysicalCertification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
 * BeneficiaryCertificationCompletionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NCER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationCompletion1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of certification completion required for a beneficiary."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BeneficiaryCertificationCompletion1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationNotRequired"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletion1Code CertificationNotRequired = new BeneficiaryCertificationCompletion1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationNotRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.mmObject();
			codeName = BeneficiaryCertificationCompletionCode.CertificationNotRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCertification"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletion1Code ElectronicCertification = new BeneficiaryCertificationCompletion1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.mmObject();
			codeName = BeneficiaryCertificationCompletionCode.ElectronicCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalCertification"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationCompletion1Code PhysicalCertification = new BeneficiaryCertificationCompletion1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.mmObject();
			codeName = BeneficiaryCertificationCompletionCode.PhysicalCertification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BeneficiaryCertificationCompletion1Code> codesByName = new LinkedHashMap<>();

	protected BeneficiaryCertificationCompletion1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NCER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationCompletion1Code";
				definition = "Specifies the type of certification completion required for a beneficiary.";
				trace_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.CertificationNotRequired,
						com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.ElectronicCertification, com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code.PhysicalCertification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificationNotRequired.getCodeName().get(), CertificationNotRequired);
		codesByName.put(ElectronicCertification.getCodeName().get(), ElectronicCertification);
		codesByName.put(PhysicalCertification.getCodeName().get(), PhysicalCertification);
	}

	public static BeneficiaryCertificationCompletion1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BeneficiaryCertificationCompletion1Code[] values() {
		BeneficiaryCertificationCompletion1Code[] values = new BeneficiaryCertificationCompletion1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BeneficiaryCertificationCompletion1Code> {
		@Override
		public BeneficiaryCertificationCompletion1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BeneficiaryCertificationCompletion1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}