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
import com.tools20022.repository.codeset.ContentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identification of the type of a Cryptographic Message Syntax (CMS) data
 * structure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentType1Code#PlainData
 * ContentType1Code.PlainData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType1Code#SignedData
 * ContentType1Code.SignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType1Code#EnvelopedData
 * ContentType1Code.EnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType1Code#DigestedData
 * ContentType1Code.DigestedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType1Code#EncryptedData
 * ContentType1Code.EncryptedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType1Code#AuthenticatedData
 * ContentType1Code.AuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
 * ContentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of a Cryptographic Message Syntax (CMS) data structure."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DATA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentType2Code
 * ContentType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ContentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#PlainData
	 * ContentType2Code.PlainData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ContentType1Code PlainData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainData";
			nextVersions_lazy = () -> Arrays.asList(ContentType2Code.PlainData);
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.PlainData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#SignedData
	 * ContentType2Code.SignedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ContentType1Code SignedData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			nextVersions_lazy = () -> Arrays.asList(ContentType2Code.SignedData);
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.SignedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#EnvelopedData
	 * ContentType2Code.EnvelopedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ContentType1Code EnvelopedData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			nextVersions_lazy = () -> Arrays.asList(ContentType2Code.EnvelopedData);
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.EnvelopedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#DigestedData
	 * ContentType2Code.DigestedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ContentType1Code DigestedData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			nextVersions_lazy = () -> Arrays.asList(ContentType2Code.DigestedData);
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.DigestedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ContentType1Code EncryptedData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.EncryptedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#AuthenticatedData
	 * ContentType2Code.AuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ContentType1Code AuthenticatedData = new ContentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			nextVersions_lazy = () -> Arrays.asList(ContentType2Code.AuthenticatedData);
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType1Code.mmObject();
			codeName = ContentTypeCode.AuthenticatedData.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ContentType1Code> codesByName = new LinkedHashMap<>();

	protected ContentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DATA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentType1Code";
				definition = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.";
				nextVersions_lazy = () -> Arrays.asList(ContentType2Code.mmObject());
				trace_lazy = () -> ContentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ContentType1Code.PlainData, com.tools20022.repository.codeset.ContentType1Code.SignedData, com.tools20022.repository.codeset.ContentType1Code.EnvelopedData,
						com.tools20022.repository.codeset.ContentType1Code.DigestedData, com.tools20022.repository.codeset.ContentType1Code.EncryptedData, com.tools20022.repository.codeset.ContentType1Code.AuthenticatedData);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PlainData.getCodeName().get(), PlainData);
		codesByName.put(SignedData.getCodeName().get(), SignedData);
		codesByName.put(EnvelopedData.getCodeName().get(), EnvelopedData);
		codesByName.put(DigestedData.getCodeName().get(), DigestedData);
		codesByName.put(EncryptedData.getCodeName().get(), EncryptedData);
		codesByName.put(AuthenticatedData.getCodeName().get(), AuthenticatedData);
	}

	public static ContentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ContentType1Code[] values() {
		ContentType1Code[] values = new ContentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ContentType1Code> {
		@Override
		public ContentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ContentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}