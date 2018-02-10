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
import com.tools20022.repository.codeset.DTCCLinkType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies types of linked events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#CorrespondingEvent
 * DTCCLinkType1Code.CorrespondingEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#Duplicate
 * DTCCLinkType1Code.Duplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#EventChangeToMandatory
 * DTCCLinkType1Code.EventChangeToMandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#EventChangeToVoluntary
 * DTCCLinkType1Code.EventChangeToVoluntary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#FractionalSecurity
 * DTCCLinkType1Code.FractionalSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#PartOfHybridSecurity
 * DTCCLinkType1Code.PartOfHybridSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#EventOnIntermediarySecurity
 * DTCCLinkType1Code.EventOnIntermediarySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#InsuredUninsuredSecurities
 * DTCCLinkType1Code.InsuredUninsuredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#EventConvertedToNewEvent
 * DTCCLinkType1Code.EventConvertedToNewEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#MultiMarket
 * DTCCLinkType1Code.MultiMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code#Other
 * DTCCLinkType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
 * DTCCLinkTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COEV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCLinkType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies types of linked events."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCLinkType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondingEvent"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code CorrespondingEvent = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondingEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.CorrespondingEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code Duplicate = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.Duplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToMandatory"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code EventChangeToMandatory = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToMandatory";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.EventChangeToMandatory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToVoluntary"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code EventChangeToVoluntary = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToVoluntary";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.EventChangeToVoluntary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalSecurity"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code FractionalSecurity = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.FractionalSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartOfHybridSecurity"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code PartOfHybridSecurity = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartOfHybridSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.PartOfHybridSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventOnIntermediarySecurity"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code EventOnIntermediarySecurity = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventOnIntermediarySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.EventOnIntermediarySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredUninsuredSecurities"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code InsuredUninsuredSecurities = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredUninsuredSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.InsuredUninsuredSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConvertedToNewEvent"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code EventConvertedToNewEvent = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConvertedToNewEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.EventConvertedToNewEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiMarket"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code MultiMarket = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.MultiMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DTCCLinkType1Code Other = new DTCCLinkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCLinkType1Code.mmObject();
			codeName = DTCCLinkTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCLinkType1Code> codesByName = new LinkedHashMap<>();

	protected DTCCLinkType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COEV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCLinkType1Code";
				definition = "Specifies types of linked events.";
				trace_lazy = () -> DTCCLinkTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCLinkType1Code.CorrespondingEvent, com.tools20022.repository.codeset.DTCCLinkType1Code.Duplicate,
						com.tools20022.repository.codeset.DTCCLinkType1Code.EventChangeToMandatory, com.tools20022.repository.codeset.DTCCLinkType1Code.EventChangeToVoluntary,
						com.tools20022.repository.codeset.DTCCLinkType1Code.FractionalSecurity, com.tools20022.repository.codeset.DTCCLinkType1Code.PartOfHybridSecurity,
						com.tools20022.repository.codeset.DTCCLinkType1Code.EventOnIntermediarySecurity, com.tools20022.repository.codeset.DTCCLinkType1Code.InsuredUninsuredSecurities,
						com.tools20022.repository.codeset.DTCCLinkType1Code.EventConvertedToNewEvent, com.tools20022.repository.codeset.DTCCLinkType1Code.MultiMarket, com.tools20022.repository.codeset.DTCCLinkType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CorrespondingEvent.getCodeName().get(), CorrespondingEvent);
		codesByName.put(Duplicate.getCodeName().get(), Duplicate);
		codesByName.put(EventChangeToMandatory.getCodeName().get(), EventChangeToMandatory);
		codesByName.put(EventChangeToVoluntary.getCodeName().get(), EventChangeToVoluntary);
		codesByName.put(FractionalSecurity.getCodeName().get(), FractionalSecurity);
		codesByName.put(PartOfHybridSecurity.getCodeName().get(), PartOfHybridSecurity);
		codesByName.put(EventOnIntermediarySecurity.getCodeName().get(), EventOnIntermediarySecurity);
		codesByName.put(InsuredUninsuredSecurities.getCodeName().get(), InsuredUninsuredSecurities);
		codesByName.put(EventConvertedToNewEvent.getCodeName().get(), EventConvertedToNewEvent);
		codesByName.put(MultiMarket.getCodeName().get(), MultiMarket);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DTCCLinkType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCLinkType1Code[] values() {
		DTCCLinkType1Code[] values = new DTCCLinkType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCLinkType1Code> {
		@Override
		public DTCCLinkType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCLinkType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}