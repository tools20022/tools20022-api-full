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
import com.tools20022.repository.codeset.AgreementFramework1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the agreement type details for the margin call.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code#FBAAgreement
 * AgreementFramework1Code.FBAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code#BBAAgreement
 * AgreementFramework1Code.BBAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code#GermanRahmenvertragAgreement
 * AgreementFramework1Code.GermanRahmenvertragAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code#ISDAAgreement
 * AgreementFramework1Code.ISDAAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code#NoReference
 * AgreementFramework1Code.NoReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
 * AgreementFrameworkCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FBAA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgreementFramework1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the agreement type details for the margin call."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgreementFramework1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FBAAgreement"</li>
	 * </ul>
	 */
	public static final AgreementFramework1Code FBAAgreement = new AgreementFramework1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FBAAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFramework1Code.mmObject();
			codeName = AgreementFrameworkCode.FBAAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAAgreement"</li>
	 * </ul>
	 */
	public static final AgreementFramework1Code BBAAgreement = new AgreementFramework1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFramework1Code.mmObject();
			codeName = AgreementFrameworkCode.BBAAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRahmenvertragAgreement"</li>
	 * </ul>
	 */
	public static final AgreementFramework1Code GermanRahmenvertragAgreement = new AgreementFramework1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRahmenvertragAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFramework1Code.mmObject();
			codeName = AgreementFrameworkCode.GermanRahmenvertragAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDAAgreement"</li>
	 * </ul>
	 */
	public static final AgreementFramework1Code ISDAAgreement = new AgreementFramework1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFramework1Code.mmObject();
			codeName = AgreementFrameworkCode.ISDAAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReference"</li>
	 * </ul>
	 */
	public static final AgreementFramework1Code NoReference = new AgreementFramework1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReference";
			owner_lazy = () -> com.tools20022.repository.codeset.AgreementFramework1Code.mmObject();
			codeName = AgreementFrameworkCode.NoReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AgreementFramework1Code> codesByName = new LinkedHashMap<>();

	protected AgreementFramework1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FBAA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementFramework1Code";
				definition = "Specifies the agreement type details for the margin call.";
				trace_lazy = () -> AgreementFrameworkCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgreementFramework1Code.FBAAgreement, com.tools20022.repository.codeset.AgreementFramework1Code.BBAAgreement,
						com.tools20022.repository.codeset.AgreementFramework1Code.GermanRahmenvertragAgreement, com.tools20022.repository.codeset.AgreementFramework1Code.ISDAAgreement,
						com.tools20022.repository.codeset.AgreementFramework1Code.NoReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FBAAgreement.getCodeName().get(), FBAAgreement);
		codesByName.put(BBAAgreement.getCodeName().get(), BBAAgreement);
		codesByName.put(GermanRahmenvertragAgreement.getCodeName().get(), GermanRahmenvertragAgreement);
		codesByName.put(ISDAAgreement.getCodeName().get(), ISDAAgreement);
		codesByName.put(NoReference.getCodeName().get(), NoReference);
	}

	public static AgreementFramework1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgreementFramework1Code[] values() {
		AgreementFramework1Code[] values = new AgreementFramework1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgreementFramework1Code> {
		@Override
		public AgreementFramework1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgreementFramework1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}