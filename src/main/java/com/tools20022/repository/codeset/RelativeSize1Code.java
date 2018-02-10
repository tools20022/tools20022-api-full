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
import com.tools20022.repository.codeset.RelativeSize1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A type of quantity of financial instrument expressed in a relative size.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSize1Code#Small
 * RelativeSize1Code.Small}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSize1Code#Medium
 * RelativeSize1Code.Medium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RelativeSize1Code#Large
 * RelativeSize1Code.Large}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RelativeSize1Code#Undisclosed
 * RelativeSize1Code.Undisclosed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
 * RelativeSizeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SMAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RelativeSize1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A type of quantity of financial instrument expressed in a relative size."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RelativeSize1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSize1Code
	 * RelativeSize1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Small"</li>
	 * </ul>
	 */
	public static final RelativeSize1Code Small = new RelativeSize1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Small";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSize1Code.mmObject();
			codeName = RelativeSizeCode.Small.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSize1Code
	 * RelativeSize1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * </ul>
	 */
	public static final RelativeSize1Code Medium = new RelativeSize1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSize1Code.mmObject();
			codeName = RelativeSizeCode.Medium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSize1Code
	 * RelativeSize1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Large"</li>
	 * </ul>
	 */
	public static final RelativeSize1Code Large = new RelativeSize1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Large";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSize1Code.mmObject();
			codeName = RelativeSizeCode.Large.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSize1Code
	 * RelativeSize1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undisclosed"</li>
	 * </ul>
	 */
	public static final RelativeSize1Code Undisclosed = new RelativeSize1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undisclosed";
			owner_lazy = () -> com.tools20022.repository.codeset.RelativeSize1Code.mmObject();
			codeName = RelativeSizeCode.Undisclosed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RelativeSize1Code> codesByName = new LinkedHashMap<>();

	protected RelativeSize1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RelativeSize1Code";
				definition = "A type of quantity of financial instrument expressed in a relative size.";
				trace_lazy = () -> RelativeSizeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RelativeSize1Code.Small, com.tools20022.repository.codeset.RelativeSize1Code.Medium, com.tools20022.repository.codeset.RelativeSize1Code.Large,
						com.tools20022.repository.codeset.RelativeSize1Code.Undisclosed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Small.getCodeName().get(), Small);
		codesByName.put(Medium.getCodeName().get(), Medium);
		codesByName.put(Large.getCodeName().get(), Large);
		codesByName.put(Undisclosed.getCodeName().get(), Undisclosed);
	}

	public static RelativeSize1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RelativeSize1Code[] values() {
		RelativeSize1Code[] values = new RelativeSize1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RelativeSize1Code> {
		@Override
		public RelativeSize1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RelativeSize1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}