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
import com.tools20022.repository.codeset.CertificateType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#DueFormationAndOrganisation
 * CertificateType1Code.DueFormationAndOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#GoodStanding
 * CertificateType1Code.GoodStanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#LetterOfReference
 * CertificateType1Code.LetterOfReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#AntiMoneyLaundering
 * CertificateType1Code.AntiMoneyLaundering}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#Incumbency
 * CertificateType1Code.Incumbency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#Passport
 * CertificateType1Code.Passport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#DrivingLicense
 * CertificateType1Code.DrivingLicense}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#IdentityCard
 * CertificateType1Code.IdentityCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code#ProofOfAddress
 * CertificateType1Code.ProofOfAddress}</li>
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
 * <li>"DFOR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of certificate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CertificateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueFormationAndOrganisation"</li>
	 * </ul>
	 */
	public static final CertificateType1Code DueFormationAndOrganisation = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueFormationAndOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.DueFormationAndOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodStanding"</li>
	 * </ul>
	 */
	public static final CertificateType1Code GoodStanding = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodStanding";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.GoodStanding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfReference"</li>
	 * </ul>
	 */
	public static final CertificateType1Code LetterOfReference = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfReference";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.LetterOfReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AntiMoneyLaundering"</li>
	 * </ul>
	 */
	public static final CertificateType1Code AntiMoneyLaundering = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AntiMoneyLaundering";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.AntiMoneyLaundering.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incumbency"</li>
	 * </ul>
	 */
	public static final CertificateType1Code Incumbency = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incumbency";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.Incumbency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passport"</li>
	 * </ul>
	 */
	public static final CertificateType1Code Passport = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Passport";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.Passport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrivingLicense"</li>
	 * </ul>
	 */
	public static final CertificateType1Code DrivingLicense = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrivingLicense";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.DrivingLicense.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCard"</li>
	 * </ul>
	 */
	public static final CertificateType1Code IdentityCard = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.IdentityCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProofOfAddress"</li>
	 * </ul>
	 */
	public static final CertificateType1Code ProofOfAddress = new CertificateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProofOfAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.CertificateType1Code.mmObject();
			codeName = CertificateTypeCode.ProofOfAddress.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CertificateType1Code> codesByName = new LinkedHashMap<>();

	protected CertificateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DFOR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateType1Code";
				definition = "Identifies the type of certificate.";
				trace_lazy = () -> CertificateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificateType1Code.DueFormationAndOrganisation, com.tools20022.repository.codeset.CertificateType1Code.GoodStanding,
						com.tools20022.repository.codeset.CertificateType1Code.LetterOfReference, com.tools20022.repository.codeset.CertificateType1Code.AntiMoneyLaundering,
						com.tools20022.repository.codeset.CertificateType1Code.Incumbency, com.tools20022.repository.codeset.CertificateType1Code.Passport, com.tools20022.repository.codeset.CertificateType1Code.DrivingLicense,
						com.tools20022.repository.codeset.CertificateType1Code.IdentityCard, com.tools20022.repository.codeset.CertificateType1Code.ProofOfAddress);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DueFormationAndOrganisation.getCodeName().get(), DueFormationAndOrganisation);
		codesByName.put(GoodStanding.getCodeName().get(), GoodStanding);
		codesByName.put(LetterOfReference.getCodeName().get(), LetterOfReference);
		codesByName.put(AntiMoneyLaundering.getCodeName().get(), AntiMoneyLaundering);
		codesByName.put(Incumbency.getCodeName().get(), Incumbency);
		codesByName.put(Passport.getCodeName().get(), Passport);
		codesByName.put(DrivingLicense.getCodeName().get(), DrivingLicense);
		codesByName.put(IdentityCard.getCodeName().get(), IdentityCard);
		codesByName.put(ProofOfAddress.getCodeName().get(), ProofOfAddress);
	}

	public static CertificateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CertificateType1Code[] values() {
		CertificateType1Code[] values = new CertificateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CertificateType1Code> {
		@Override
		public CertificateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CertificateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}