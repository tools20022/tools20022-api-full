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
import com.tools20022.repository.codeset.DTCCQuantitySought1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the quantity sought type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code#Quantity
 * DTCCQuantitySought1Code.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code#CheckComments
 * DTCCQuantitySought1Code.CheckComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code#Percentage
 * DTCCQuantitySought1Code.Percentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
 * DTCCQuantitySoughtCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"QTTY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCQuantitySought1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the quantity sought type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCQuantitySought1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code
	 * DTCCQuantitySought1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * </ul>
	 */
	public static final DTCCQuantitySought1Code Quantity = new DTCCQuantitySought1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySought1Code.mmObject();
			codeName = DTCCQuantitySoughtCode.Quantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code
	 * DTCCQuantitySought1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckComments"</li>
	 * </ul>
	 */
	public static final DTCCQuantitySought1Code CheckComments = new DTCCQuantitySought1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckComments";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySought1Code.mmObject();
			codeName = DTCCQuantitySoughtCode.CheckComments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code
	 * DTCCQuantitySought1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * </ul>
	 */
	public static final DTCCQuantitySought1Code Percentage = new DTCCQuantitySought1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySought1Code.mmObject();
			codeName = DTCCQuantitySoughtCode.Percentage.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCQuantitySought1Code> codesByName = new LinkedHashMap<>();

	protected DTCCQuantitySought1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QTTY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCQuantitySought1Code";
				definition = "Specifies the quantity sought type.";
				trace_lazy = () -> DTCCQuantitySoughtCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCQuantitySought1Code.Quantity, com.tools20022.repository.codeset.DTCCQuantitySought1Code.CheckComments,
						com.tools20022.repository.codeset.DTCCQuantitySought1Code.Percentage);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Quantity.getCodeName().get(), Quantity);
		codesByName.put(CheckComments.getCodeName().get(), CheckComments);
		codesByName.put(Percentage.getCodeName().get(), Percentage);
	}

	public static DTCCQuantitySought1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCQuantitySought1Code[] values() {
		DTCCQuantitySought1Code[] values = new DTCCQuantitySought1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCQuantitySought1Code> {
		@Override
		public DTCCQuantitySought1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCQuantitySought1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}