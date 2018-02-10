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
import com.tools20022.repository.codeset.CertificateType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#AntiMoneyLaundering
 * CertificateType2Code.AntiMoneyLaundering}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#DrivingLicense
 * CertificateType2Code.DrivingLicense}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#DueFormationAndOrganisation
 * CertificateType2Code.DueFormationAndOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#GoodStanding
 * CertificateType2Code.GoodStanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#IdentityCard
 * CertificateType2Code.IdentityCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#Incumbency
 * CertificateType2Code.Incumbency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#LetterOfReference
 * CertificateType2Code.LetterOfReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#Passport
 * CertificateType2Code.Passport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#ProofOfAddress
 * CertificateType2Code.ProofOfAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code#PublicKeyInfrastructureCertificate
 * CertificateType2Code.PublicKeyInfrastructureCertificate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
 * CertificateTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMLC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of certificate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CertificateType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AntiMoneyLaundering"</li>
	 * </ul>
	 */
	public static final CertificateType2Code AntiMoneyLaundering = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AntiMoneyLaundering";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.AntiMoneyLaundering.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrivingLicense"</li>
	 * </ul>
	 */
	public static final CertificateType2Code DrivingLicense = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrivingLicense";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.DrivingLicense.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueFormationAndOrganisation"</li>
	 * </ul>
	 */
	public static final CertificateType2Code DueFormationAndOrganisation = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueFormationAndOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.DueFormationAndOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodStanding"</li>
	 * </ul>
	 */
	public static final CertificateType2Code GoodStanding = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodStanding";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.GoodStanding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCard"</li>
	 * </ul>
	 */
	public static final CertificateType2Code IdentityCard = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.IdentityCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incumbency"</li>
	 * </ul>
	 */
	public static final CertificateType2Code Incumbency = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incumbency";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.Incumbency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfReference"</li>
	 * </ul>
	 */
	public static final CertificateType2Code LetterOfReference = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfReference";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.LetterOfReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passport"</li>
	 * </ul>
	 */
	public static final CertificateType2Code Passport = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Passport";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.Passport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProofOfAddress"</li>
	 * </ul>
	 */
	public static final CertificateType2Code ProofOfAddress = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProofOfAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.ProofOfAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType2Code
	 * CertificateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicKeyInfrastructureCertificate"</li>
	 * </ul>
	 */
	public static final CertificateType2Code PublicKeyInfrastructureCertificate = new CertificateType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicKeyInfrastructureCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType2Code.mmObject();
			codeName = CertificateTypeCode.PublicKeyInfrastructureCertificate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CertificateType2Code> codesByName = new LinkedHashMap<>();

	protected CertificateType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMLC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateType2Code";
				definition = "Specifies the type of certificate.";
				trace_lazy = () -> CertificateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificateType2Code.AntiMoneyLaundering, com.tools20022.repository.codeset.CertificateType2Code.DrivingLicense,
						com.tools20022.repository.codeset.CertificateType2Code.DueFormationAndOrganisation, com.tools20022.repository.codeset.CertificateType2Code.GoodStanding,
						com.tools20022.repository.codeset.CertificateType2Code.IdentityCard, com.tools20022.repository.codeset.CertificateType2Code.Incumbency, com.tools20022.repository.codeset.CertificateType2Code.LetterOfReference,
						com.tools20022.repository.codeset.CertificateType2Code.Passport, com.tools20022.repository.codeset.CertificateType2Code.ProofOfAddress,
						com.tools20022.repository.codeset.CertificateType2Code.PublicKeyInfrastructureCertificate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AntiMoneyLaundering.getCodeName().get(), AntiMoneyLaundering);
		codesByName.put(DrivingLicense.getCodeName().get(), DrivingLicense);
		codesByName.put(DueFormationAndOrganisation.getCodeName().get(), DueFormationAndOrganisation);
		codesByName.put(GoodStanding.getCodeName().get(), GoodStanding);
		codesByName.put(IdentityCard.getCodeName().get(), IdentityCard);
		codesByName.put(Incumbency.getCodeName().get(), Incumbency);
		codesByName.put(LetterOfReference.getCodeName().get(), LetterOfReference);
		codesByName.put(Passport.getCodeName().get(), Passport);
		codesByName.put(ProofOfAddress.getCodeName().get(), ProofOfAddress);
		codesByName.put(PublicKeyInfrastructureCertificate.getCodeName().get(), PublicKeyInfrastructureCertificate);
	}

	public static CertificateType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CertificateType2Code[] values() {
		CertificateType2Code[] values = new CertificateType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CertificateType2Code> {
		@Override
		public CertificateType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CertificateType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}