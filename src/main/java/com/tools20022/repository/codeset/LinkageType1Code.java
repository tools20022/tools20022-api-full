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
import com.tools20022.repository.codeset.LinkageType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of linkage requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LinkageType1Code#Link
 * LinkageType1Code.Link}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LinkageType1Code#Unlink
 * LinkageType1Code.Unlink}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LinkageType1Code#Soft
 * LinkageType1Code.Soft}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LinkageTypeCode
 * LinkageTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LINK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LinkageType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of linkage requested."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LinkageType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LinkageType1Code
	 * LinkageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Link"</li>
	 * </ul>
	 */
	public static final LinkageType1Code Link = new LinkageType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Link";
			owner_lazy = () -> com.tools20022.repository.codeset.LinkageType1Code.mmObject();
			codeName = LinkageTypeCode.Link.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LinkageType1Code
	 * LinkageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unlink"</li>
	 * </ul>
	 */
	public static final LinkageType1Code Unlink = new LinkageType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unlink";
			owner_lazy = () -> com.tools20022.repository.codeset.LinkageType1Code.mmObject();
			codeName = LinkageTypeCode.Unlink.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LinkageType1Code
	 * LinkageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * </ul>
	 */
	public static final LinkageType1Code Soft = new LinkageType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soft";
			owner_lazy = () -> com.tools20022.repository.codeset.LinkageType1Code.mmObject();
			codeName = LinkageTypeCode.Soft.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LinkageType1Code> codesByName = new LinkedHashMap<>();

	protected LinkageType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LINK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LinkageType1Code";
				definition = "Type of linkage requested.";
				trace_lazy = () -> LinkageTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LinkageType1Code.Link, com.tools20022.repository.codeset.LinkageType1Code.Unlink, com.tools20022.repository.codeset.LinkageType1Code.Soft);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Link.getCodeName().get(), Link);
		codesByName.put(Unlink.getCodeName().get(), Unlink);
		codesByName.put(Soft.getCodeName().get(), Soft);
	}

	public static LinkageType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LinkageType1Code[] values() {
		LinkageType1Code[] values = new LinkageType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LinkageType1Code> {
		@Override
		public LinkageType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LinkageType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}